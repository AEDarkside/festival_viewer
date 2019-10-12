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
public class recordLabel {
    private String lblName;
    
    public String getLblName(){
        return this.lblName;
    }
    
    @Override
    public String toString(){
        return this.lblName;
    }
}
