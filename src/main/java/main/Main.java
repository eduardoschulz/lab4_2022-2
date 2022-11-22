package main;

import emergencia.Vacinacao;

public class Main {
    public static void main(String[] args) {
        
    
    Vacinacao vax = new Vacinacao();

    Paciente pac1 = new Paciente(10, "10");
    Paciente pac2 = new Paciente(20, "20");
    Paciente pac3 = new Paciente(100, "100");
    vax.vacinacao(pac1,pac2,pac3);
    }


}
