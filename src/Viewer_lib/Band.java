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
public class Band {
    private List<String> fest;
    private String bandName = "Not Available";
    private String recordLbl = "Not Available";
    
    public Band(List<String> fest, String name, String recordLbl){
        this.fest = fest;
        this.bandName = name;
        this.recordLbl = recordLbl;
    }
    
    public String getBandName(){
        return this.bandName;
    }
    
    public String recordLbl(){
        return this.recordLbl;
    }
    
    public List<String> getFestivalName(){
        return this.fest;
    }
    
    @Override
    public String toString(){
        return "\t" + this.bandName + this.fest.toString();
    }
}
