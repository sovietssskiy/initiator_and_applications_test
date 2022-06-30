package com.company.initiatorandapplicationsv14.screen.application;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Application;

@UiController("Application.edit")
@UiDescriptor("application-edit.xml")
@EditedEntityContainer("applicationDc")
public class ApplicationEdit extends StandardEditor<Application> {
}