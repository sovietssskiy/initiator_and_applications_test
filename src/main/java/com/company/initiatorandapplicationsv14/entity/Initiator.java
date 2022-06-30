package com.company.initiatorandapplicationsv14.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "INITIATOR", indexes = {
        @Index(name = "IDX_EMPLOYEE_USER_ID", columnList = "USER_ID"),
        @Index(name = "IDX_EMPLOYEE_DEPARTAMENT_ID", columnList = "DEPARTAMENT_ID"),
        @Index(name = "IDX_EMPLOYEE_POSITION_ID", columnList = "POSITION_ID")
})
@Entity
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
public class Initiator {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "FULL_NAME", nullable = false)
    @NotNull
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}