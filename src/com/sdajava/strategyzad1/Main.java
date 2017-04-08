package com.sdajava.strategyzad1;

import com.sdajava.strategyzad1.controller.Pracownik;

public class Main {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik("Mechanik");
        pracownik1.execute();

        Pracownik pracownik2 = new Pracownik("Lekarz");
        pracownik2.execute();

        Pracownik pracownik3 = new Pracownik("Listonosz");
        pracownik3.execute();


    }
}
