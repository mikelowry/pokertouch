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
public class BetAction extends Action {

    /**
     *
     * @param amount
     */
    BetAction(int amount) {
    
    super("Bet", "bets", amount);
    }
        /** {@inheritDoc} */
    @Override
    public String toString() {
        return String.format("Bet(%d)", getAmount());
    }
    
    
}
