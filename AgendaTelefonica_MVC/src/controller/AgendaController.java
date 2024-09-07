
package controller;
import model.InfoContact;
import model.AgendaModel;
import view.AgendaView;

public class AgendaController {
    private  AgendaModel model;
    private  AgendaView view;

    public AgendaController(AgendaModel model, AgendaView view) {
        this.model = model;
        this.view = view;
    }
    
    public void start(){
        while(true){
            int choice = view.displayMenu();
            switch(choice){
                case 1 -> {
                    InfoContact contact = view.getContactDetails();
                    model.addContact(contact);
                }
                case 2 -> view.displayContacts(model.getContacts());
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
