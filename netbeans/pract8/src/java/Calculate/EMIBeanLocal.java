/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

import javax.ejb.Local;

/**
 *
 * @author hites
 */
@Local
public interface EMIBeanLocal {

    double businessMethod(final double principle, final double rate, final int year);
    
}
