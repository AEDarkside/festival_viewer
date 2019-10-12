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
    private String festName = "Not Available";
    private List<Band> Bands;
    
    public String getFestivalName(){
        return this.festName;
    }
    
    public List<Band> getBands(){
        return this.Bands;
    }
    
    @Override
    public String toString(){
        return "\n" + this.festName + "\n\t" + this.Bands.toString();
    }
}
