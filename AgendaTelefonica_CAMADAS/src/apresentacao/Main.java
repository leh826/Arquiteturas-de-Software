package apresentacao;

import aplicacao.AgendaService;
import infraestrutura.AgendaRepository;

public class Main {
    public static void main(String[] args){
        AgendaRepository repository = new AgendaRepository();
        AgendaService service = new AgendaService(repository);
        AgendaView view = new AgendaView();
        AgendaController controller = new AgendaController(service,view);
        controller.start();
    }
}
