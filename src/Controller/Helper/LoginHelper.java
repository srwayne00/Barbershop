package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author SrTrojan
 */
public class LoginHelper implements IHelper{
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        //pegar um usuario da view.
        String nome = view.getCampoUsuario().getText();
        String senha = view.getCampoSenha().getText();
        
        Usuario modelo = new Usuario(0, nome,senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getCampoUsuario().setText(nome);
        view.getCampoSenha().setText(senha);
    }
        public void limparTela(){
        view.getCampoUsuario().setText("");
        view.getCampoSenha().setText("");
            
        }
    
    
}

