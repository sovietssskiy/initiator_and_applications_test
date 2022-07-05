package com.company.initiatorandapplicationsv14.screen.applicationsofinitiators;

import com.company.initiatorandapplicationsv14.app.CheckApp;
import io.jmix.core.LoadContext;
import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.ApplicationsofInitiators;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("ApplicationsofInitiators.browse")
@UiDescriptor("applicationsof-initiators-browse.xml")
@LookupComponent("applicationsofInitiatorsesTable")
public class ApplicationsofInitiatorsBrowse extends StandardLookup<ApplicationsofInitiators> {
    @Autowired
    private CheckApp checkApp;

    @Install(to = "applicationsofinitiatorsDl", target = Target.DATA_LOADER)
    private List<ApplicationsofInitiators> applicationsofinitiatorsDlLoadDelegate(LoadContext<ApplicationsofInitiators> loadContext) {
        return checkApp.getListInitiators();
    }
}