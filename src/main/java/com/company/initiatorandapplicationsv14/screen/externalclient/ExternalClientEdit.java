package com.company.initiatorandapplicationsv14.screen.externalclient;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.ExternalClient;

@UiController("ExternalClient.edit")
@UiDescriptor("external-client-edit.xml")
@EditedEntityContainer("externalClientDc")
public class ExternalClientEdit extends StandardEditor<ExternalClient> {
}