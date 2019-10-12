package Viewer_lib;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darkside-PC
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class recordBuilder {
    public static List<Festival> buildRecord(){
        ObjectMapper objMapper = new ObjectMapper();
        List<Festival> festivals = null;
        String urlString = (String)("http://eacodingtest.digital.energyaustralia.com.au/"
                + "api/v1/festivals");
        
        try{
            URL targetUrl = new URL(urlString);
            festivals = objMapper.readValue(targetUrl, new TypeReference<List<Festival>>() {});
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return festivals;
    }
    
}
