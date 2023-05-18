package com.java.project;

import java.time.LocalDate;

public interface Servicos {
    void agendar();
    void cancelarAgendamento();

    // consultar horários disponíveis no dia
    void consultarHorarios(LocalDate data);

    /* consultar dias disponíveis no mês

     void consultarHorarios();

     */
}
