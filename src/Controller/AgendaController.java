package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author SrTrojan
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        //buscar lista com agendamentos do bd   
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        //exibir lista na view
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente(){
        //buscar no bd
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //exibir no campo cliente
        helper.preencherCliente(clientes);    
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServico(servicos);       
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }      
    
    public void agendar(){

        //Buscar obj agendamento da tela
         Agendamento agendamento = helper.obterModelo();

        //Salvar obj no bd
        new AgendamentoDAO().insert(agendamento);
        
        //Envia o email
        Correio correio = new Correio();
        correio.NotificarPorEmail(agendamento);
        
        //Inserir elemento na tabela
        atualizaTabela();
        helper.limparTela();
        
    }
}
          
 