package com.company.initiatorandapplicationsv14.entity;

import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.JmixEntity;

import java.util.UUID;

@JmixEntity
public class ApplicationsofInitiators {
    @JmixId
    private UUID applicationID;

    private String initiatorName;

    private String applicationsDescription;

    public String getApplicationsDescription() {
        return applicationsDescription;
    }

    public void setApplicationsDescription(String applicationsDescription) {
        this.applicationsDescription = applicationsDescription;
    }

    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    public UUID getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(UUID applicationID) {
        this.applicationID = applicationID;
    }
}