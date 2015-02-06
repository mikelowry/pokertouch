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
public abstract class Action {
    
        /** Player went all-in. */
    public static final Action ALL_IN = new AllInAction();

    /** Bet. */
    public static final Action BET = new BetAction(0);
    
    /** Posting the big blind. */
    public static final Action BIG_BLIND = new BigBlindAction();
    
    /** Call. */
    public static final Action CALL = new CallAction();
    
    /** Check. */
    public static final Action CHECK = new CheckAction();
    
    /** Continue. */
    public static final Action CONTINUE = new ContinueAction();
    
    /** Fold. */
    public static final Action FOLD = new FoldAction();
    
    /** Raise. */
    public static final Action RAISE = new RaiseAction(0);
    
    /** Posting the small blind. */
    public static final Action SMALL_BLIND = new SmallBlindAction();
    
    /** The action's name. */
    private final String name;
    
    /** The action's verb. */
    private final String verb;
    
    /** The amount (if appropriate). */
    private final int amount;
    
    /**
     * Constructor.
     * 
     * @param name
     *            The action's name.
     * @param verb
     *            The action's verb.
     */
    public Action(String name, String verb) {
        this(name, verb, 0);
    }
    
    /**
     * Constructor.
     * 
     * @param name
     *            The action's name.
     * @param verb
     *            The action's verb.
     * @param amount
     *            The action's amount.
     */
    public Action(String name, String verb, int amount) {
        this.name = name;
        this.verb = verb;
        this.amount = amount;
    }
    
    /**
     * Returns the action's name.
     * 
     * @return The action's name.
     */
    public final String getName() {
        return name;
    }
    
    /**
     * Returns the action's verb.
     * 
     * @return The action's verb.
     */
    public final String getVerb() {
        return verb;
    }
    
    /**
     * Returns the action's amount.
     * 
     * @return The action's amount.
     */
    public final int getAmount() {
        return amount;
    }
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return name;
    }
    
}
