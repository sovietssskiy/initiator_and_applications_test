package com.company.initiatorandapplicationsv14.screen.position;

import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Position;

@UiController("Position_.browse")
@UiDescriptor("position-browse.xml")
@LookupComponent("positionsTable")
public class PositionBrowse extends StandardLookup<Position> {
}