package com.company.initiatorandapplicationsv14.screen.initiator;

import com.company.initiatorandapplicationsv14.entity.Employee;
import com.company.initiatorandapplicationsv14.entity.ExternalClient;
import io.jmix.ui.ScreenBuilders;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.screen.*;
import com.company.initiatorandapplicationsv14.entity.Initiator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@UiController("Initiator.browse")
@UiDescriptor("initiator-browse.xml")
@LookupComponent("initiatorsTable")
public class InitiatorBrowse extends StandardLookup<Initiator> {
    @Autowired
    private ScreenBuilders screenBuilders;

    @Autowired
    private CollectionContainer<Initiator> initiatorsDc;

    @Autowired
    private GroupTable<Initiator> initiatorsTable;

    @Subscribe("createBtn.createEmployee")
    public void onCreateBtnCreateEmployee(Action.ActionPerformedEvent event) {
        final Screen editor = screenBuilders.editor(Employee.class, this)
                .newEntity()
                .withOpenMode(OpenMode.DIALOG)
                /*
                in case you need to have type as stored parameter
                .withInitializer(entity -> entity.setType(Type.ROOM))
                 */
                .build();
        editor.addAfterCloseListener(e -> {
            if (!Objects.equals(e.getCloseAction(), WINDOW_COMMIT_AND_CLOSE_ACTION)) {
                return;
            }

            final Employee edited = ((StandardEditor<Employee>) e.getSource()).getEditedEntity();
            initiatorsDc.getMutableItems().add(0, edited);
            initiatorsTable.setSelected(edited);
            initiatorsTable.focus();
        });
        editor.show();

    }

    @Subscribe("createBtn.createExternalClient")
    public void onCreateBtnCreateExternalClient(Action.ActionPerformedEvent event) {
        final Screen editor = screenBuilders.editor(ExternalClient.class, this)
                .newEntity()
                .withOpenMode(OpenMode.DIALOG)
                /*
                in case you need to have type as stored parameter
                .withInitializer(entity -> entity.setType(Type.ROOM))
                 */
                .build();
        editor.addAfterCloseListener(e -> {
            if (!Objects.equals(e.getCloseAction(), WINDOW_COMMIT_AND_CLOSE_ACTION)) {
                return;
            }

            final ExternalClient edited = ((StandardEditor<ExternalClient>) e.getSource()).getEditedEntity();
            initiatorsDc.getMutableItems().add(0, edited);
            initiatorsTable.setSelected(edited);
            initiatorsTable.focus();
        });
        editor.show();
    }



}