package com.company.initiatorandapplicationsv14.screen.application;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Application;

@UiController("Application.browse")
@UiDescriptor("application-browse.xml")
@LookupComponent("applicationsTable")
public class ApplicationBrowse extends StandardLookup<Application> {
}