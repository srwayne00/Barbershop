package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
/**
 *
 * @author Denner Dias
 */
public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        Email email = new Email(
                "Barbearia", 
                "Mensagem padrao da barbearia",
                "srwayne00@gmail.com");
        
        email.enviar();
        

    }
    
}
