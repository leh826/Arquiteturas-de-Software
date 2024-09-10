package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import view.AgendaView;

public class AgendaModel {

    private List<InfoContact> contacts;
    private AgendaView view;
    private Scanner scanner;

    public AgendaModel() {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addContact(InfoContact contact) {
        contacts.add(contact);
    }

    public boolean deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public void alterContact(int alter, int choice) {
        if (alter >= 0 && alter < contacts.size()) {
        InfoContact contact = contacts.get(alter);
        System.out.println("Current details: " + contact);      
            switch (choice) {
                case 1:
                    System.out.println("Insert new name: ");
                    String newName = scanner.nextLine();
                    contact.setName(newName);
                    System.out.println("Name updated.");
                    break;
                case 2:
                    System.out.println("Insert new surname: ");
                    String newSurname = scanner.nextLine();
                    contact.setSurName(newSurname);
                    System.out.println("Surname updated.");
                    break;
                case 3:
                    System.out.println("Insert new phone number: ");
                    String newPhone = scanner.nextLine();
                    contact.setTelephone(newPhone);
                    System.out.println("Phone number updated.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
    } else {
        System.out.println("Not found contact.");
    }
    }

    public List<InfoContact> getContacts() {
        return contacts;
    }
}
