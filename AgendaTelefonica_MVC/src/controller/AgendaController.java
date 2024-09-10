package controller;

import java.util.List;
import java.util.Scanner;
import model.InfoContact;
import model.AgendaModel;
import view.AgendaView;

public class AgendaController {

    private AgendaModel model;
    private AgendaView view;
    private Scanner scanner;

    public AgendaController(AgendaModel model, AgendaView view) {
        this.model = model;
        this.view = view;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1 -> {
                    InfoContact contact = view.getContactDetails();
                    model.addContact(contact);
                }
                case 2 ->
                    view.displayContacts(model.getContacts());
                case 3 -> {
                    List<InfoContact> contacts = model.getContacts();
                    if (contacts.isEmpty()) {
                        System.out.println("The agenda is empty.");
                    } else {
                        view.displayContacts(contacts);
                        System.out.println("which contact choose delete? (Enter corresponding order)");
                        int index = scanner.nextInt() - 1;
                        scanner.nextLine();

                        boolean sucesso = model.deleteContact(index);
                        if (sucesso) {
                            System.out.println("\nContactdeleted successfully.");
                        } else {
                            System.out.println("Erro:order invalid.");
                        }
                    }
                }
                case 4 -> {
                    view.displayContacts(model.getContacts());
                    System.out.println("What contact choice alter?? (Enter corresponding order)");
                    int contact = scanner.nextInt() - 1;
                    scanner.nextLine();    
                    int update = view.displayAlter();
                    model.alterContact(contact, update);     
                }

                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default ->
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}