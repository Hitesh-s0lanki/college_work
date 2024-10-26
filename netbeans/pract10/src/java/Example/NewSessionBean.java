/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import javax.ejb.Singleton;

/**
 *
 * @author hites
 */
@Singleton
public class NewSessionBean implements NewSessionBeanLocal {

    private int count = 0;
    
    @Override
    public void incr() {
        count++;
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int returnCount() {
        return count;
    }
}
