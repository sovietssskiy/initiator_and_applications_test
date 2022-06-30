package com.company.initiatorandapplicationsv14.screen.initiator;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Initiator;

@UiController("Initiator.edit")
@UiDescriptor("initiator-edit.xml")
@EditedEntityContainer("initiatorDc")
public class InitiatorEdit extends StandardEditor<Initiator> {
}