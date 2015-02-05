/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertouch;

import org.mt4j.MTApplication;

/**
 *
 * @author Caliste
 */
public class Pokertouch extends MTApplication{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        initialize();
    }

    @Override
    public void startUp()
    {
        addScene(new TestScene(this, "test"));
    }
    
}
