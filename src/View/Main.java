package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author SrTrojan
 */
public class Main {
    public static void main(String[] args){
        /*Tipo String = Variavel nome*/
        String nome = "Tiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Tiago", "Rua Teste,123", "18113-511");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario.getNome());
      
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "25/07/2018 09:15");
        System.out.println(agendamento.getCliente().getNome());
        
    }
    
}
