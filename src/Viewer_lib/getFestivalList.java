/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer_lib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;
/**
 *
 * @author Darkside-PC
 */
public class getFestivalList {
    public static JSONArray getList(){
        JSONArray festivalJSON = null;
        String urlString = (String)("http://eacodingtest.digital.energyaustralia.com.au/"
                + "api/v1/festivals");
        
        //ouput message that indicate progress
        System.out.println("Requested URL:" + urlString);
        StringBuilder builder = new StringBuilder();
        URLConnection connection = null;
        InputStreamReader input = null;
        
        try{
            //request festival entry from swagger api
            URL url = new URL(urlString);
            connection = url.openConnection();
            input = new InputStreamReader(connection.getInputStream());
            
            try(BufferedReader reader = new BufferedReader(
            input)){
                String entry;
                if(reader != null){
                    while((entry = reader.readLine()) != null){
                        builder.append(entry);
                    }
                }
                reader.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            
        input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        //convert Festival data String to JSON array
        try{
            festivalJSON = new JSONArray(builder.toString()); 
        }catch(JSONException JSONEx){
            JSONEx.printStackTrace();
        }
        
        return festivalJSON;
    }
}
