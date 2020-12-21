
package game;

import java.util.*;
import java.time.*;








public class Factory {
    
    
    private void Attribute1;

    
    
    private void Attribute2;

    
    
    private City ;

    private void getAttribute1() {
        return Attribute1;
    }

    private void getAttribute2() {
        return Attribute2;
    }

    public City get() {
        return ;
    }

    private void setAttribute1(void Attribute1) {
        this.Attribute1 = Attribute1;
    }

    private void setAttribute2(void Attribute2) {
        this.Attribute2 = Attribute2;
    }

    public void set(City ) {
        this. = ;
    }

    public void link(City _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }



}