/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.util.Comparator;

/**
 *
 * @author Rajkai
 */
public class Rendezes implements Comparator<Balozok>{

    /*
    Név sor szerint Ábécé sorrendben rendezzük a bálozók neveit.
    */
    
    @Override
    public int compare(Balozok t, Balozok t1) {
        return t.getNev().compareTo(t1.getNev());
    }
    
}
