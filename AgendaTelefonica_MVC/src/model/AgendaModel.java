package model;

import java.util.ArrayList;
import java.util.List;

public class AgendaModel {
    private List<InfoContact> contacts;
    
    public AgendaModel(){
        contacts = new ArrayList<>();
    }
    public void addContact(InfoContact contact){
        contacts.add(contact);
    }
    public List<InfoContact>getContacts(){
        return contacts;
    }
}
