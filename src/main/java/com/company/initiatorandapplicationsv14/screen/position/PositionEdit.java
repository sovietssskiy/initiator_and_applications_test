package com.company.initiatorandapplicationsv14.screen.position;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Position;

@UiController("Position_.edit")
@UiDescriptor("position-edit.xml")
@EditedEntityContainer("positionDc")
public class PositionEdit extends StandardEditor<Position> {
}