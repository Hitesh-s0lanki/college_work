/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import javax.ejb.Local;

/**
 *
 * @author hites
 */
@Local
public interface NewSessionBeanLocal {

    double RupeesToDollar(final double rupees);
    
}
