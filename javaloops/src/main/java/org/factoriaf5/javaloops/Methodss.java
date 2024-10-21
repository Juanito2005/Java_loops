package org.factoriaf5.javaloops;

import java.util.ArrayList;

public class Methodss {
    public ArrayList<String> Numeros(Integer numero) {
        ArrayList<String> listaNumeros = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            int result = numero * i;
            listaNumeros.add(numero + " x " + i + " = " + result);
        }
        return listaNumeros;
    }
}