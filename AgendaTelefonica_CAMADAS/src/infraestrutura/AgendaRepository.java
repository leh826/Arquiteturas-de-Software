
package infraestrutura;

import dominio.Agenda;
import java.util.ArrayList;
import java.util.List;

public class AgendaRepository {
    private List<Agenda>contacts;
    
    public AgendaRepository(){
        contacts = new ArrayList<>();
    }
    public void addContact(Agenda contact){
        contacts.add(contact);
    }
    public List<Agenda>getcontacts(){
        return contacts;
    }
}
