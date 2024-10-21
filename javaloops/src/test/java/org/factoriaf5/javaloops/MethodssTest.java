package org.factoriaf5.javaloops;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MethodssTest {
    private Methodss metodo;

    @BeforeEach
    public void init () {
        this.metodo = new Methodss();
    }
    @Test
    public void testNumeros () {
        ArrayList<String> result = metodo.Numeros(5);
        ArrayList<String> seEspera = new ArrayList<String>();
        seEspera.add("5 x 1 = 5");
        seEspera.add("5 x 2 = 10");
        seEspera.add("5 x 3 = 15");
        seEspera.add("5 x 4 = 20");
        seEspera.add("5 x 5 = 25");
        seEspera.add("5 x 6 = 30");
        seEspera.add("5 x 7 = 35");
        seEspera.add("5 x 8 = 40");
        seEspera.add("5 x 9 = 45");
        seEspera.add("5 x 10 = 50");

        assertEquals(seEspera, result);
    }
    @Test
    public void returnArray () {
        assertInstanceOf(ArrayList.class, metodo.Numeros(5));
    }
    @Test
    public void arraylongitud () {
        ArrayList<String> result = metodo.Numeros(5);
        assertEquals(10, result.size());
    }
    @Test
    public void NegativeNumber() {
        ArrayList<String> resultado = metodo.Numeros(-3);
        ArrayList<String> seEspera = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            seEspera.add("-3 x " + i + " = " + (-3 * i));
        }

        assertEquals(seEspera, resultado);
    }
}