/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

/**
 *
 * @author Emile
 */
public enum TableType {
    
      
    /** Fixed-Limit Texas Hold'em. */
    FIXED_LIMIT("Fixed-Limit"),
    
    /** No-Limit Texas Hold'em. */
    NO_LIMIT("No-Limit"),
    
    ;
    
    /** Display name. */
    private String name;
    
    /**
     * Constructor.
     * 
     * @param name
     *            The display name.
     */
    TableType(String name) {
        this.name = name;
    }
    
    /**
     * Returns the display name.
     * 
     * @return The display name.
     */
    public String getName() {
        return name;
    }
    
}
