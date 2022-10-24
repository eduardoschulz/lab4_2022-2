package fila;

import emergencia.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Fila {
    private PriorityQueue<Paciente> fila;

    public Fila(Comparator condicao) {
        fila = new PriorityQueue<Paciente>(condicao);
    }

    public PriorityQueue<Paciente> getFila() {
        return fila;
    }

    public void setFila(PriorityQueue<Paciente> fila) {
        this.fila = fila;
    }
}