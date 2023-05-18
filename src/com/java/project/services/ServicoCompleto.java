package com.java.project.services;

import com.java.project.Servicos;

import java.time.LocalDate;

public class ServicoCompleto implements Servicos {


    @Override
    public void consultarHorarios(LocalDate data) {

    }

    @Override
    public void agendar(){
        System.out.println("Seu agendamento foi realizado com sucesso!");
    }
    public void cancelarAgendamento(){
        System.out.println("Seu agendamento foi cancelado com sucesso!");
    }

}




