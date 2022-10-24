package fila_teste;

import emergencia.Paciente;
import fila.ComparadorIdade;
import fila.Fila;
import org.junit.Assert;
import org.junit.Test;

public class FilaTeste {
    Paciente test1 = new Paciente(1, "1");
    Paciente test2 = new Paciente(2, "2");
    Paciente test3 = new Paciente(3, "3");
    Paciente test4 = new Paciente(4, "4");
    Fila filaTeste = new Fila(new ComparadorIdade());


    @Test
    public void testOrdemFila() {
        filaTeste.getFila().add(test1);
        filaTeste.getFila().add(test2);
        filaTeste.getFila().add(test3);
        filaTeste.getFila().add(test4);
        Assert.assertEquals(filaTeste.getFila().poll(), test4);
    }
}
