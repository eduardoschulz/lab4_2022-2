package emergencia;

import emergencia.*;
import fila.ComparadorIdade;
import fila.Fila;

import java.util.ArrayList;

public class Vacinacao {
    ComparadorIdade condicao = new ComparadorIdade();
    Fila entrada = new Fila(condicao);
    Fila saida = new Fila(condicao);

    public ComparadorIdade getCondicao() {
        return condicao;
    }

    public void setCondicao(ComparadorIdade condicao) {
        this.condicao = condicao;
    }

    public Fila getEntrada() {
        return entrada;
    }

    public void setEntrada(Fila entrada) {
        this.entrada = entrada;
    }

    public Fila getSaida() {
        return saida;
    }

    public void setSaida(Fila saida) {
        this.saida = saida;
    }

    public void vacinacao(Paciente... pacientes){


        for (Paciente paciente:pacientes) {
           entrada.getFila().add(paciente);
        }

        while (!entrada.getFila().isEmpty()) {
            Paciente vacinado = entrada.getFila().poll();
            saida.getFila().add(vacinado);
        }
    }




}
