package com.sdajava.strategyzad1.controller;

import com.sdajava.strategyzad1.czaswolny.LiteraturaPopularnoNaukowa;
import com.sdajava.strategyzad1.czaswolny.Silownia;
import com.sdajava.strategyzad1.czaswolny.SpedzanieWolnegoCzasu;
import com.sdajava.strategyzad1.dojazd.Dojezdzac;
import com.sdajava.strategyzad1.dojazd.Rower;
import com.sdajava.strategyzad1.dojazd.Samochod;
import com.sdajava.strategyzad1.zawod.Leczenie;
import com.sdajava.strategyzad1.zawod.Naprawa;
import com.sdajava.strategyzad1.zawod.RoznoszenieListow;
import com.sdajava.strategyzad1.zawod.Zawod;

/**
 * Created by RENT on 2017-04-08.
 */
public class Pracownik {

    Dojezdzac dojezdzac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    Zawod zawod;

    public Pracownik (String imie){
        switch (imie) {
            case "Mechanik":
                this.zawod = new Naprawa();
                this.dojezdzac = new Rower();
                this.spedzanieWolnegoCzasu = new Silownia();
                break;
            case "Lekarz":
                this.zawod = new Leczenie();
                this.dojezdzac = new Samochod();
                this.spedzanieWolnegoCzasu = new LiteraturaPopularnoNaukowa();
                break;
            case "Listonosz":
                this.zawod = new RoznoszenieListow();
                this.dojezdzac = new Rower();
                this.spedzanieWolnegoCzasu = new Silownia();
                break;

        }


    }
    public void execute(){
        dojezdzac.dojezdzaj();
        zawod.zawod();
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }



}
