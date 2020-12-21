
package game;

import java.util.*;
import java.time.*;








public class PlanetData {
    
    
    private Planet ;

    
    
    private Weather ;

    
    
    private Atmosphere ;

    public Planet get() {
        return ;
    }

    public Weather get() {
        return ;
    }

    public Atmosphere get() {
        return ;
    }

    public void set(Planet ) {
        this. = ;
    }

    public void set(Weather ) {
        this. = ;
    }

    public void set(Atmosphere ) {
        this. = ;
    }

    public void link(Planet _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Weather _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Atmosphere _) {
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

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    
    
    public PlanetData() {
    
    
    }


}