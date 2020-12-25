
package Game;

import java.util.*;
import java.time.*;








public class Humidity {
    
    
    private Weather ;

    public Weather get() {
        return ;
    }

    public void set(Weather ) {
        this. = ;
    }

    public void link(Weather _) {
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