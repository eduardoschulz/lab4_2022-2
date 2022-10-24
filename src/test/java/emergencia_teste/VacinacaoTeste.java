package emergencia_teste;

import emergencia.Paciente;
import emergencia.Vacinacao;
import org.junit.Assert;
import org.junit.Test;

public class VacinacaoTeste {
    @Test
    public void testeOrdem(){
        Vacinacao vax = new Vacinacao();

        Paciente pac1 = new Paciente(10, "10");
        Paciente pac2 = new Paciente(20, "20");
        Paciente pac3 = new Paciente(100, "100");
        vax.vacinacao(pac1,pac2,pac3);
        Assert.assertEquals(vax.getSaida().getFila().poll(), pac3);
    }
    @Test
    public void isEntradaVazia(){
        Vacinacao vax = new Vacinacao();
        Paciente pac1 = new Paciente(10, "10");
        Paciente pac2 = new Paciente(20, "20");
        Paciente pac3 = new Paciente(100, "100");

        vax.vacinacao(pac1,pac2,pac3);
        Assert.assertEquals(vax.getEntrada().getFila().isEmpty(), true);
    }
}
