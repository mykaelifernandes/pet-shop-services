package com.java.project.services;

import com.java.project.Servicos;

public class Vacinacao implements Servicos {

    int maxAgendamentos = 10;
    int numAgendamentos = 9;

    @Override
    public void agendar(){
        System.out.println("A vacinação do seu pet foi agendadada com sucesso!");
    }
    public void cancelarAgendamento(){
        System.out.println("Seu agendamento foi cancelado com sucesso!");
    }

    public void consultarHorarios(){

    }
}
