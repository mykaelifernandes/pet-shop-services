package com.java.project.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Banho implements Servicos {

    int maxAgendamentos = 10;
    int numAgendamentos = 5;


    private List<LocalDateTime> horariosDisponiveis;

    public Banho() {
        // Lista com os horários disponíveis

        horariosDisponiveis = new ArrayList<>();

        horariosDisponiveis.add(LocalDateTime.now().plusDays(10).withHour(9).withMinute(0));
        horariosDisponiveis.add(LocalDateTime.now().plusDays(11).withHour(9).withMinute(30));
        horariosDisponiveis.add(LocalDateTime.now().plusDays(12).withHour(10).withMinute(0));
    }
    @Override
    public void consultarHorarios(LocalDate data) {}
    @Override
    public void agendar() {
        if (numAgendamentos < maxAgendamentos) {
            numAgendamentos++;
            System.out.println("O agendamento para dar banho no seu pet, foi realizado com sucesso!");
        } else {
            System.out.println("Infelizmente não temos mais vagas para dar banho hoje!");
        }
    }
            @Override
            public void cancelarAgendamento(){
        System.out.println("Seu agendamento foi cancelado com sucesso!");
    }

}
