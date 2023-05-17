package com.java.project.services;

import com.java.project.Servicos;

public class Castracao implements Servicos {

    int maxAgendamentos = 2;
    int numAgendamentos = 1;

    boolean agendamento;

    @Override
    public void agendar(){
    if (numAgendamentos < maxAgendamentos) {
        numAgendamentos++;
        System.out.println("A cirurgia do seu pet foi agendada com sucesso!");
    } else{
        System.out.println("Infelizmente não temos mais vagas para realizar castrações hoje!");
    }
    }
    public void cancelarAgendamento(){
        System.out.println("Seu agendamento foi cancelado com sucesso, para remarcar novamente, consulte os horários disponíveis.");
    }

    public void consultarHorarios(){

    }
    public void consultarAgendamento(){


    }
}
