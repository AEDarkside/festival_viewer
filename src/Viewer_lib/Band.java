/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer_lib;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darkside-PC
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Band {
    private String name = "Not Available";
    private String recordLabel = "Not Available";
    private List<String> festivals = new ArrayList<>();
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getRecordLabel(){
        return this.recordLabel;
    }
    
    public void setRecordLabel(String recordLabel){
        this.recordLabel = recordLabel;
    }
    
    public List<String> getFestivals(){
        return this.festivals;
    }
    
    public void setFestivals(List<String> festivals){
        this.festivals = festivals;
    }
    
    @Override
    public String toString(){
        return "\t" + this.name + " Label: " + this.recordLabel;
    }
}
