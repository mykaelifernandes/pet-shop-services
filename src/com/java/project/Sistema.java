package com.java.project;

public class Sistema {

     private Servicos servicos;

     public void setServicos(Servicos servicos){
             this.servicos = servicos;
     }
     public void agendar(){
             servicos.agendar();
     }
     public void cancelarAgendamento(){
             servicos.cancelarAgendamento();
     }

    // public void consultarHorarios(){ servicos.consultarHorarios();}

}
