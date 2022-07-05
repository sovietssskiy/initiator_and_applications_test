package com.company.initiatorandapplicationsv14.screen.application;

import com.company.initiatorandapplicationsv14.entity.Status;
import io.jmix.ui.component.Button;
import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Application;
import io.jmix.ui.theme.ThemeClassNames;

@UiController("Application.edit")
@UiDescriptor("application-edit.xml")
@EditedEntityContainer("applicationDc")
public class ApplicationEdit extends StandardEditor<Application> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Application> event) {
        event.getEntity().setStatus(Status.OPEN);
    }

    @Subscribe("nextBtn")
    public void onNextBtnClick(Button.ClickEvent event) {
        Button button = event.getSource();
        button.click();
    }



    
}