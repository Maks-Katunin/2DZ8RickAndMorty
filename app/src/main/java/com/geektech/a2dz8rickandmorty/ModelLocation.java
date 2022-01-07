package com.geektech.a2dz8rickandmorty;

import java.io.Serializable;

public class ModelLocation implements Serializable {
    private String loc, loc2;

    public ModelLocation(String loc, String loc2) {
        this.loc = loc;
        this.loc2 = loc2;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getLoc2() {
        return loc2;
    }

    public void setLoc2(String loc2) {
        this.loc2 = loc2;
    }
}
