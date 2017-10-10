/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajkai
 */
public class Golya extends Balozok {

    private static int kedvezmenySzazalek;
    private List<ZeneSzam> zeneLista;

    public Golya(String nev, String evFolyam) {
        super(nev, evFolyam);
        zeneLista = new ArrayList<>();
    }

    public void kivalaszt(ZeneSzam zeneSzam) {
        zeneLista.add(zeneSzam);
    }

    @Override
    public void fogyaszt(int koltseg) {
        // felülírjuk, mert ő is fogyaszt, csak kevesebbe kerül neki. Tehát az ertek értékét csökkenteni kell :)
        koltseg -= koltseg * (kedvezmenySzazalek / 100);
        super.fogyaszt(koltseg); //itt meg meghívjuk a szülő osztály metódusát, me pont azt csinálja ami kell, csak a módosított értékkel.
    }

    public static int getKedvezmenySzazalek() {
        return kedvezmenySzazalek;
    }

    public List<ZeneSzam> getZeneLista() {
        return zeneLista;
    }

    public static void setKedvezmenySzazalek(int kedvezmenySzazalek) {
        Golya.kedvezmenySzazalek = kedvezmenySzazalek;
    }

    public void setZeneLista(List<ZeneSzam> zeneLista) {
        this.zeneLista = zeneLista;
    }

    @Override
    public String toString() {
        return super.toString() + "(g)";
    }
}
