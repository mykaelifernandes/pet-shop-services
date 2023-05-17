package com.java.project.services;

import com.java.project.Servicos;

public class ServicoCompleto implements Servicos {

    int maxAgendamentos = 15;
    int numAgendamentos = 14;

    @Override
    public void agendar(){
        System.out.println("Seu agendamento foi realizado com sucesso!");
    }
    public void cancelarAgendamento(){
        System.out.println("Seu agendamento foi cancelado com sucesso!");
    }

    public void consultarHorarios(){

    }
}


