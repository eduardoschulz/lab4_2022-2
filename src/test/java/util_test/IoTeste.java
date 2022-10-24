package util_test;

import org.junit.Assert;
import org.junit.Test;

import util.Io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class IoTeste {
    /*
    *  TODO - Segundo Input não existe
    * */
    @Test
    public void StringTest(){
        String hello = "Hello";
        InputStream in = new ByteArrayInputStream(hello.getBytes());
        System.setIn(in);
        Assert.assertEquals("Hello", Io.inputString());
    }
    @Test
    public void StringTestString(){
        String hello = "Hello";
        InputStream in = new ByteArrayInputStream(hello.getBytes());
        System.setIn(in);
        Assert.assertEquals("Hello", Io.inputString("Hello?\n"));
        System.setIn(new ByteArrayInputStream(null));
    }
}
