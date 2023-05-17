package com.java.project.services;

import com.java.project.Servicos;

public class Banho implements Servicos {

    int maxAgendamentos = 10;
    int numAgendamentos = 5;

    @Override
    public void agendar(){
        System.out.println("O gendamento para dar banho no seu pet, foi realizado com sucesso!");
    }
    public void cancelarAgendamento(){
        System.out.println("Seu agendamento foi cancelado com sucesso!");
    }

    public void consultarHorarios(){

    }
}
