/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import javax.ejb.Local;

/**
 *
 * @author hites
 */
@Local
public interface NewSessionBeanLocal {

    void incr();

    int returnCount();
    
}
