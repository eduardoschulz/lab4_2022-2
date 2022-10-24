package emergencia;

import emergencia.*;
import fila.ComparadorIdade;
import fila.Fila;

import java.util.ArrayList;

public class Vacinacao {
    public static void main(String[] args) {
        ComparadorIdade condicao = new ComparadorIdade();
        Fila entrada = new Fila(condicao);
        Fila saida = new Fila(condicao);
        ArrayList<Paciente> www = new ArrayList();
        Paciente veio1 = new Paciente(92, "a");
        Paciente jovem1 = new Paciente(12, "b");
        Paciente veio2 = new Paciente(291, "c");

        entrada.getFila().add(veio1);
        entrada.getFila().add(jovem1);
        entrada.getFila().add(veio2);

        www.add(veio1);
        www.add(veio2);
        www.add(jovem1);
        System.out.printf("%s\n", www.get(1).getNome());
        while (!entrada.getFila().isEmpty()){
           Paciente vacinado= entrada.getFila().poll();
           saida.getFila().add(vacinado);
           System.out.printf("%s\n", vacinado.getNome());
        }


    }




}
