/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoreexample;

import java.util.concurrent.Semaphore;

/**
 *
 * @author daniel
 */
public class Nightclub {
    private Semaphore sem;
    public Nightclub() {
        sem = new Semaphore(2);
    }
    
    public void enter() throws InterruptedException {
        this.sem.acquire();
        System.out.println("Entered the nightclub");
    }
    
    public void leave() {
        this.sem.release();
        System.out.println("Left the nightclub");
    }
}
