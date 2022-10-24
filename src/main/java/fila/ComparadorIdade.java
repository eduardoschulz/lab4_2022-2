package fila;

import emergencia.Paciente;

import java.util.Comparator;

public class ComparadorIdade implements Comparator<Paciente> {

    @Override
    public int compare(Paciente a, Paciente b){
        return a.getIdade() < b.getIdade() ? 1 : -1;
    }
}
