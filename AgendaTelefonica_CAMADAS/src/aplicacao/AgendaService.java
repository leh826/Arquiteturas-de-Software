
package aplicacao;

import dominio.Agenda;
import infraestrutura.AgendaRepository;
import java.util.List;

public class AgendaService {
    private AgendaRepository repository;
    
    public AgendaService(AgendaRepository repository){
        this.repository = repository;
    }
    public void addContact(String name, String surname, String telephone){
        Agenda contact = new Agenda  (name,surname,telephone);
        repository.addContact(contact);
    }
    public List<Agenda> getAllProducts(){
        return repository.getcontacts();
    }
}
