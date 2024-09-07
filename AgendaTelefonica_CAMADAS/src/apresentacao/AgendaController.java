
package apresentacao;

import aplicacao.AgendaService;
import apresentacao.AgendaView;

public class AgendaController {
    private AgendaService service;
    private AgendaView view;

    public AgendaController(AgendaService model, AgendaView view) {
        this.service = model;
        this.view = view;
    }
    
    public void start(){
        while(true){
            int choice = view.displayMenu();
            switch(choice){
                case 1:
                    String name = view.getContactName();
                    String surname = view.getContactSurname();
                    String phonenumber = view.getContactTelephone();
                    service.addContact(name, surname, phonenumber);
                    break;
                case 2:
                    view.displayContacts(service.getAllProducts());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
