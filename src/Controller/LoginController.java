package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author SrTrojan
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
    private Object usarioAutenticado;
    

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
                
    }
    
    
    public void entrarNoSistema(){
        //pesquisar o usuario no banco de dados.    
        Usuario usuario = helper.obterModelo();
        //pegar usuar no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se usuario da view for igual usuario do banco direcionar menu principal
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();  //navegar para menu principal
            menu.setVisible(true);
            this.view.dispose();
        //senao mostrar mensagem ao usuario "usuario ou senha invalido"     
        }else{
            view.exibeMensagem("Usuario ou Senha Invalido");
            
        }
        
    }
    
  public void fizTarefa(){
      System.out.println("Busquei algo do banco de dados!!");
      this.view.exibeMensagem("Executei o fiz Tarefa");
      
  }      
    
}
