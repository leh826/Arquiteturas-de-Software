
package apresentacao;

import aplicacao.AgendaService;
import dominio.Agenda;
import java.util.List;
import java.util.Scanner;

public class AgendaController {
    private AgendaService service;
    private AgendaView view;
    private Scanner scanner;
    List<Agenda> contacts;

    public AgendaController(AgendaService service, AgendaView view) {
        this.service = service;
        this.view = view;
        scanner = new Scanner(System.in);
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
                    contacts = service.getAllContacts();
                    if(contacts.isEmpty()){
                        System.out.println("The agenda is empty.");
                    }else{
                    view.displayContacts(contacts);
                    }
                case 3:
                    contacts = service.getAllContacts();
                    if (contacts.isEmpty()) {
                        System.out.println("The agenda is empty.");
                    } else {
                        view.displayContacts(contacts);
                        System.out.println("which contact choose delete? (Enter corresponding order)");
                        int index = scanner.nextInt() - 1;
                        scanner.nextLine();

                        boolean sucesso = service.deleteContacts(index,contacts);
                        if (sucesso) {
                            System.out.println("\nContact deleted successfully.");
                        } else {
                            System.out.println("Erro:order invalid.");
                        }
                    }
                    break;
                
                case 4:
                    contacts = service.getAllContacts();
                    view.displayContacts(contacts);
                    System.out.println("which contact choose alter? (Enter corresponding order)");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine();
                    int update = view.displayAlter();
                    service.updateContacts(index, update,contacts); 
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
