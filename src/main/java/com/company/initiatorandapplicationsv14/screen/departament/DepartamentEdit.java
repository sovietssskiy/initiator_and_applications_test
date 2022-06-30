package com.company.initiatorandapplicationsv14.screen.departament;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Departament;

@UiController("Departament.edit")
@UiDescriptor("departament-edit.xml")
@EditedEntityContainer("departamentDc")
public class DepartamentEdit extends StandardEditor<Departament> {
}