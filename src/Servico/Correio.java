package Servico;

import Model.Agendamento;

/**
 *
 * @author SrTrojan
 */
public class Correio {
    public void NotificarPorEmail(Agendamento agendamento){
        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        //Uso da classe de email
        Email email = new Email("Agendamento barbershop", emailFormatado, destinatario);
        email.enviar();
    }

    private String formatarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá" + nomeCliente + " Vai dar uma tapa no visu..Seu agendamento para " +  
                servico + ",esta marcado para o dia "+ dataAgendamento + "ás " + horaAgendamento +
                "O preço pra vc sai baratin, fica R$ " + valor + "Forte Abraço!!";
    }
    
}
