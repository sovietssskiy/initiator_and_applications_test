package com.company.initiatorandapplicationsv14.screen.departament;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Departament;

@UiController("Departament.browse")
@UiDescriptor("departament-browse.xml")
@LookupComponent("departamentsTable")
public class DepartamentBrowse extends StandardLookup<Departament> {
}