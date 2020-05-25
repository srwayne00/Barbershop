package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SrTrojan
 */
public class AgendaHelper implements IHelper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabelaAgendamento().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
        
            tableModel.addRow(new Object[]{
               agendamento.getId(),
               agendamento.getCliente().getNome(),
               agendamento.getServico().getDescricao(),
               agendamento.getValor(),
               agendamento.getDataFormatada(),
               agendamento.getHoraFormatada(),
               agendamento.getObservacao()                    
            });
        }
    }

    public void preencherCliente(ArrayList<Cliente> clientes) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();
       
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
       }
    }

        public void preencherServico(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxServico().getModel();
        
        for (Servico servico : servicos){    
           comboBoxModel.addElement(servico);
        }
    }
    public Cliente obterCliente() {
       return (Cliente)view.getJComboBoxCliente().getSelectedItem();
    }
        
    public Servico obterServico() {
       return (Servico)view.getJComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getCampoValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        String idString  = view.getCampoId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getCampoValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getCampoData().getText();
        String hora = view.getCampoHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getCampoObservacao2().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
        
    }

    @Override
    public void limparTela() {
        view.getCampoId().setText("");
        view.getCampoData().setText("");
        view.getCampoHora().setText("");
        view.getCampoObservacao2().setText("");
        
           
    }
}
