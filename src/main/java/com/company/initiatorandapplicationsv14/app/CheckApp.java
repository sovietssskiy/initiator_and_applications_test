package com.company.initiatorandapplicationsv14.app;

import com.company.initiatorandapplicationsv14.entity.Application;
import com.company.initiatorandapplicationsv14.entity.ApplicationsofInitiators;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CheckApp {
    @Autowired
    private DataManager dataManager;

    public List<ApplicationsofInitiators> getListInitiators () {
        List<Application> applications = dataManager.load(Application.class).all().fetchPlan("application-with-initiator").list();
        List<ApplicationsofInitiators> applicationsofInitiators = applications.stream().map(application -> {
            ApplicationsofInitiators listIn = dataManager.create(ApplicationsofInitiators.class);
            listIn.setApplicationID(application.getId());
            listIn.setInitiatorName(application.getInitiator().getFullName());
            listIn.setApplicationsDescription(application.getDescription());
            return listIn;
        }).collect(Collectors.toList());
        return applicationsofInitiators;
    }
}