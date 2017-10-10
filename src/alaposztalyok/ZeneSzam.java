/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

/**
 *
 * @author Rajkai
 */
public class ZeneSzam
{

    private String eloado;
    private String dalCim;
    
    public ZeneSzam(String eloado, String dalCim)
    {
        this.eloado = eloado;
        this.dalCim = dalCim;
    }

    public String getEloado()
    {
        return eloado;
    }

    public String getDalCim()
    {
        return dalCim;
    }

    @Override
    public String toString()
    {
        return eloado + ": " + dalCim;
    }

}
