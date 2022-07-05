package com.company.initiatorandapplicationsv14.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Status implements EnumClass<String> {

    OPEN("Open"),
    UNDER_REVIEW("Under review"),
    ON_APPROVAL(" On approval"),
    ON_AGREEMENT("On agreement"),
    CLOSED("Closed");

    private String id;

    Status(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Status fromId(String id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}