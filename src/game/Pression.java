/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package game;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF19X6YVtjNu0E= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF19X6YVtjNu0E= >>
// ----------- >>
public class Pression {
    // ----------- << attribute.annotations@AAAAAAF19ZMaZeJye68= >>
    // ----------- >>
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

    // ----------- << method.annotations@AAAAAAF2JEFwbI0mD6A= >>
    // ----------- >>
    public Pression() {
    // ----------- << method.body@AAAAAAF2JEFwbI0mD6A= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF19X6YVtjNu0E= >>
// ----------- >>
}