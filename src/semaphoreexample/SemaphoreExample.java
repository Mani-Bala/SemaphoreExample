/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoreexample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class SemaphoreExample implements Runnable {

    /**
     * @param args the command line arguments
     */
    
    static Nightclub nightclub;
    public static void main(String[] args) {
        // TODO code application logic here
        nightclub = new Nightclub();
        
        for (int i = 0; i < 5; i++)
        {
            Thread t = new Thread(new SemaphoreExample());
            t.start();
        }
        
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                nightclub.enter();
                nightclub.leave();
            } catch (InterruptedException ex) {
                Logger.getLogger(SemaphoreExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
