/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sjp12
 */
public class Archive {
    private String identity;
    private String name;
    
    public Archive (String identity, String name) {
        this.identity = identity;
        this.name = name;
    }
    
    public String getIdentifier() {
        return identity;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return identity + ": " + name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedItem = (Archive) compared;
        
        if (this.identity.equals(comparedItem.identity)) {
            return true;
        }
        return false;
    }
}
