/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer_lib;

/**
 *
 * @author Darkside-PC
 */
public class Festival {
    private String festName;
    
    public String getFestivalName(){
        return this.festName;
    }
    
    public String toString(){
        return "\n\t" + this.festName;
    }
}
