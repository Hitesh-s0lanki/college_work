/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import javax.ejb.Stateful;

/**
 *
 * @author hites
 */
@Stateful
public class NewSessionBean implements NewSessionBeanLocal {

    @Override
    public double RupeesToDollar(final double rupees) {   
        return rupees / 84.07;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
