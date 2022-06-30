package com.company.initiatorandapplicationsv14.screen.externalclient;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.ExternalClient;

@UiController("ExternalClient.browse")
@UiDescriptor("external-client-browse.xml")
@LookupComponent("externalClientsTable")
public class ExternalClientBrowse extends StandardLookup<ExternalClient> {
}