/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer_lib;

import java.util.ArrayList;

/**
 *
 * @author Darkside-PC
 */
public class Band {
    private ArrayList<Festival> fest;
    private String bandName;
    
    public String getBandName(){
        return this.bandName;
    }
    
    public ArrayList<Festival> getFestivalName(){
        return this.fest;
    }
    
    @Override
    public String toString(){
        return "\t" + this.bandName + this.fest.toString();
    }
}
