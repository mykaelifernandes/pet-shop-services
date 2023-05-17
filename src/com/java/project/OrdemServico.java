package com.java.project;

import com.java.project.services.Banho;
import com.java.project.services.Castracao;
import com.java.project.services.ServicoCompleto;
import com.java.project.services.Vacinacao;

public class OrdemServico {

    public static void main(String[] args) {

        Banho banho = new Banho();
        Castracao castrar = new Castracao();
        Vacinacao vacinar = new Vacinacao();
        ServicoCompleto servicoCompleto = new ServicoCompleto();

        Sistema sistema = new Sistema();
        sistema.setServicos(banho);
        sistema.agendar();
        sistema.cancelarAgendamento();

        sistema.setServicos(castrar);
        sistema.agendar();
        sistema.cancelarAgendamento();

        sistema.setServicos(vacinar);
        sistema.agendar();
        sistema.cancelarAgendamento();

        sistema.setServicos(servicoCompleto);
        sistema.agendar();
        sistema.cancelarAgendamento();














    }
}
