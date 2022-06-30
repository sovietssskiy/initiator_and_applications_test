package com.company.initiatorandapplicationsv14.screen.initiator;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Initiator;

@UiController("Initiator.browse")
@UiDescriptor("initiator-browse.xml")
@LookupComponent("initiatorsTable")
public class InitiatorBrowse extends StandardLookup<Initiator> {
}