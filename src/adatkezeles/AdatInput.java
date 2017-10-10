/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adatkezeles;

import alaposztalyok.Balozok;
import alaposztalyok.ZeneSzam;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Rajkai
 */
public interface AdatInput {
    public DefaultListModel<Balozok> balozokModell() throws Exception;
    public DefaultListModel<ZeneSzam> zeneSzamModel() throws Exception;
    public List<ZeneSzam> zeneLista() throws Exception;
}
