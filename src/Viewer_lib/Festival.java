/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer_lib;

import java.util.List;

/**
 *
 * @author Darkside-PC
 */
public class Festival {
    private String name = "[Not Available]";
    private List<Band> bands;
    
    //getter and setter class for jackson json api
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public List<Band> getBands(){
        return this.bands;
    }
    
    public void setBands(List<Band> bands){
        this.bands = bands;
    }
    
    @Override
    public String toString(){
        return "\n" + this.name + "\n\t" + this.bands.toString();
    }
}
