/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

import javax.ejb.Stateful;

/**
 *
 * @author hites
 */
@Stateful
public class EMIBean implements EMIBeanLocal {

    @Override
    public double businessMethod(final double principle, final double rate, final int year) {
        double monthlyRate = rate / 12 * 100;
        double months = year * 12;
        
        return (principle )
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
