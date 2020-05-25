package Controller;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author SrTrojan
 */
public class MenuPrincipalController {
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        this.view.dispose();
        
    }
    
}
