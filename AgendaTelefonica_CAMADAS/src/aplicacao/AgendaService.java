package aplicacao;

import dominio.Agenda;
import infraestrutura.AgendaRepository;
import java.util.List;
import java.util.Scanner;

public class AgendaService {

    private AgendaRepository repository;
    private Scanner scanner;

    public AgendaService(AgendaRepository repository) {
        this.repository = repository;
        scanner = new Scanner(System.in);
    }

    public void addContact(String name, String surname, String telephone) {
        Agenda contact = new Agenda(name, surname, telephone);
        repository.addContact(contact);
    }

    public List<Agenda> getAllContacts() {
        return repository.getcontacts();
    }

    public void updateContacts(int index, int choice, List<Agenda>contacts) {
        if (index >= 0 && index < contacts.size()) {
            Agenda contact = contacts.get(index);
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

    public boolean deleteContacts(int index, List<Agenda> contacts) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            return true;
        } else {
            return false;
        }
    }
}
