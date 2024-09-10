
package apresentacao;

import dominio.Agenda;
import java.util.List;
import java.util.Scanner;

public class AgendaView {
    private Scanner scanner;

    public AgendaView() {
        scanner = new Scanner (System.in);
    }
    
    public void displayContacts(List<Agenda>contacts){
        System.out.println("*****************");
        System.out.println("Contacts List:");
        for(Agenda contact:contacts){
            System.out.println(contact);
        }
    }
    public String getContactName(){
        scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }
    public String getContactSurname(){
        System.out.println("Enter Surname: ");
        String surname = scanner.nextLine();
        return surname;
    }
        public String getContactTelephone(){
         System.out.println("Enter phonumber: ");
        String telephone = scanner.nextLine();
        return telephone;
    }
   public int displayAlter(){
        System.out.println("******************");
        System.out.println("1. Name: ");
        System.out.println("2. Surname: ");
        System.out.println("3. Update Phonenumber: ");
        return scanner.nextInt();
    }
    public int displayMenu(){
        System.out.println("*****************");
        System.out.println("1. Add Contact");
        System.out.println("2. View Agenda");
        System.out.println("3. Delete Contact of Agenda");
        System.out.println("4. Update Agenda");
        System.out.println("5. Exit");
        System.out.println("Choose an option: ");
        return scanner.nextInt();
   }
}
