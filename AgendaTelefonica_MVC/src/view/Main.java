package view;

import controller.AgendaController;
import model.AgendaModel;

public class Main {
    public static void main(String[] args){
        AgendaModel model = new AgendaModel();
        AgendaView view = new AgendaView();
        AgendaController controller = new AgendaController(model,view);
        controller.start();
    }
}
