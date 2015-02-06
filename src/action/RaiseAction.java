/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

/**
 *
 * @author Emile
 */
public class RaiseAction extends Action {

    /**
     * Constructor.
     * 
     * @param amount
     *            The amount to raise with.
     */
    RaiseAction(int amount) {
        super("Raise", "raises", amount);
    }
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return String.format("Raise(%d)", getAmount());
    }
    
}
