package sample;

import javafx.scene.control.TextField;
import sample.datamodel.Contact;

/**
 * Created by HomePC on 26/12/2016.
 */
public class ContactController {
    public TextField firstNameField;
    public TextField lastNameField;
    public TextField phoneNumberField;
    public TextField notesField;

    public Contact getNewContact() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String notes = notesField.getText();

        return new Contact(firstName, lastName, phoneNumber, notes);
    }
}
