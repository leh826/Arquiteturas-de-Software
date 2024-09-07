package view;

import java.util.List;
import java.util.Scanner;
import model.InfoContact;

public class AgendaView {
    private Scanner scanner;

    public AgendaView() {
        scanner = new Scanner (System.in);
    }
    
    public void displayContacts(List<InfoContact>contacts){
        System.out.println("******************");
        System.out.println("Contact List:");
        for(InfoContact contact:contacts){
            System.out.println(contact);
        }
    }
    
    public InfoContact getContactDetails(){
        scanner.nextLine();
        System.out.println("******************");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter phonenumber: [(DD)*********]");
        String telephone = scanner.nextLine();
        return new InfoContact(name,surname,telephone);
    }
    public int displayMenu(){
        System.out.println("\n1. Add Contact");
        System.out.println("2. View Agenda");
        System.out.println("3. Exit");
        System.out.println("Choose an option: ");
        return scanner.nextInt();
   }
    
}
