/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author Rajkai
 */
public class Balozok implements Comparable<Balozok> {

    private String nev;
    private String evFolyam;
    private int zsebPenz;
    private int elkoltottPenz;
    private int tancainakSzama;

    public Balozok(String nev, String evFolyam) // itt nem kell a sorszám, mert úgy számoltatod ki a konstruktorban
    {
        this.nev = nev;
        this.evFolyam = evFolyam;
    }

    public void fogyaszt(int koltseg) {
        if (koltseg <= zsebPenz) {
            zsebPenz -= koltseg;
            elkoltottPenz += koltseg;
        }
    }

    public void tancol() {
        this.tancainakSzama++;
    }

    @Override
    public int compareTo(Balozok t) {
        return this.nev.compareTo(t.nev);
    }

    public String getEvFolyam() {
        return evFolyam;
    }

    public String getNev() {
        return nev;
    }

    public int getZsebPenz() {
        return zsebPenz;
    }

    public int getTancainakSzama() {
        return tancainakSzama;
    }

    public int getElkoltottPenz() {
        return elkoltottPenz;
    }

    public void setElkoltottPenz(int elkoltottPenz) {
        this.elkoltottPenz = elkoltottPenz;
    }

    public void setEvFolyam(String evFolyam) {
        this.evFolyam = evFolyam;
    }

    public void zsebPenz(int zsebPenz) {
        this.zsebPenz += zsebPenz;
    }

    @Override
    public String toString() {
        if (this.tancainakSzama > 0) {
            return nev + " (" + tancainakSzama + " tánc, " + elkoltottPenz + " Ft)";
        }

        return nev;
    }

}
