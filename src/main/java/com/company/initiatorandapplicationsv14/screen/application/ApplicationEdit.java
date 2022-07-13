package com.company.initiatorandapplicationsv14.screen.application;

import com.company.initiatorandapplicationsv14.entity.Employee;
import com.company.initiatorandapplicationsv14.entity.ExternalClient;
import com.company.initiatorandapplicationsv14.entity.Status;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.Notifications;
import io.jmix.ui.component.Button;
import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@UiController("Application.edit")
@UiDescriptor("application-edit.xml")
@EditedEntityContainer("applicationDc")
public class ApplicationEdit extends StandardEditor<Application> {


    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Application> event) {
        event.getEntity().setStatus(Status.OPEN);
    }

    @Autowired
    private Notifications notifications;
    @Autowired
    private MessageBundle messageBundle;

    /*
    * Функция события клика мыши сравнивает инициатора с исполнителем заявки.
    * Если инициатор - внешний клиент или сотрудник, который также является исполнителем, то при нажатии на кнопку пеняется статус заявки.
    * В ином случае, будет выведено сообщение, в котором написано, что прав у данного пользователя на измену статуса нет.
    * */
    @Subscribe("nextBtn")
    public void onNextBtnClick(Button.ClickEvent event) {

        if (getEditedEntity().getExecutor().getUser().equals(currentAuthentication.getUser()) && (getEditedEntity().getInitiator().equals(getEditedEntity().getExecutor())  || getEditedEntity().getInitiator().getClass().equals(ExternalClient.class))) {
            if (getEditedEntity().getStatus().equals(Status.OPEN)) {
                getEditedEntity().setStatus(Status.UNDER_REVIEW);
            } else if (getEditedEntity().getStatus().equals(Status.UNDER_REVIEW)) {
                getEditedEntity().setStatus(Status.ON_APPROVAL);
            } else if (getEditedEntity().getStatus().equals(Status.ON_APPROVAL)) {
                getEditedEntity().setStatus(Status.ON_AGREEMENT);
            } else if (getEditedEntity().getStatus().equals(Status.ON_AGREEMENT)) {
                getEditedEntity().setStatus(Status.CLOSED);
                getEditedEntity().setCloseDate(LocalDateTime.now());
            } else {
                notifications.create()
                        .withCaption(messageBundle.getMessage("applicationEdit.closedStatus"))
                        .show();
            }
        } else {
            notifications.create()
                    .withCaption(messageBundle.getMessage("applicationEdit.noChan"))
                    .show();
        }



    }





    
}