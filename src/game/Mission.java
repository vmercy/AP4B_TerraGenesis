
package game;

import java.util.*;
import java.time.*;








public class Mission extends Mission {
    
    
    private double reward;

    
    
    private String title;

    
    
    private String description;

    
    
    private boolean achieved;

    
    
    private Game ;

    private double getReward() {
        return reward;
    }

    private String getTitle() {
        return title;
    }

    private String getDescription() {
        return description;
    }

    private boolean isAchieved() {
        return achieved;
    }

    public Game get() {
        return ;
    }

    private void setReward(double reward) {
        this.reward = reward;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setAchieved(boolean achieved) {
        this.achieved = achieved;
    }

    public void set(Game ) {
        this. = ;
    }

    public void link(Game _) {
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

    
    
    public Mission() {
    
    
    }
    
    
    public void missionAchieved() {
    
    
    }


}