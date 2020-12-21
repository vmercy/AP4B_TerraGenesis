
package game;

import java.util.*;
import java.time.*;








public class Gaz {
    
    
    private double proportion;

    
    
    private String name;

    
    
    private Atmosphere ;

    
    
    private Atmosphere ;

    
    
    private Oxygen ;

    private double getProportion() {
        return proportion;
    }

    private String getName() {
        return name;
    }

    public Atmosphere get() {
        return ;
    }

    public Atmosphere get() {
        return ;
    }

    public Oxygen get() {
        return ;
    }

    private void setProportion(double proportion) {
        this.proportion = proportion;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void set(Atmosphere ) {
        this. = ;
    }

    public void set(Atmosphere ) {
        this. = ;
    }

    public void set(Oxygen ) {
        this. = ;
    }

    public void link(Atmosphere _) {
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

    public void link(Oxygen _) {
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

    
    
    public Gaz() {
    
    
    }


}