/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer_lib;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Darkside-PC
 */

public class recordBuilder {
    //request data from swagger api
    public static List<Festival> apiRequester(){
        ObjectMapper objMapper = new ObjectMapper();
        List<Festival> festivals = null;
        String urlString = (String)("http://eacodingtest.digital.energyaustralia.com.au/"
                + "api/v1/festivals");
        
        //get json array to list of festival object
        try{
            URL targetUrl = new URL(urlString);
            festivals = objMapper.readValue(targetUrl, new TypeReference<List<Festival>>() {});
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return festivals;
    }
    
    //build band from festivals list and order by record label
    public static List<Band> buildBands(List<Festival> festivals){
        /*  parse festival list into list of bands and order by record label and
        *   then order by band's name
        */
        List<Band> bands = null;
        bands = festivals
                .stream()
                .flatMap(Festival -> Festival.getBands().stream())
                .sorted(Comparator.comparing(Band::getRecordLabel)
                        .thenComparing(Band -> Band.getName()))
                .collect(Collectors.toList());
        
        //retrive list of festival for band    
        for(Band band : bands){
            List<String> festList = null;
            festList = festivals
                    .stream()
                    .filter(Festival -> Festival.getBands().contains(band))    
                    .map(Festival::getName)
                    .collect(Collectors.toList());
            //sort festival list
            Collections.sort(festList);
            //assign festival list to band
            band.getFestivals().addAll(festList);
        }
        
        return bands;
    }
    
    //format output string to ignore duplicate record label
    public static void formatOutput(List<Band> bands){
        int defaultIndex = 0;
        String defaultLabel = "[Not Available]";
        String lastLabel = bands.get(defaultIndex).getRecordLabel();
        
        for(Band band : bands){
            String currLabel = band.getRecordLabel();
            
            //compare label name
            if(currLabel.equals("")){
                band.setRecordLabel(defaultLabel);
                System.out.println(band.toString());
            }else if(currLabel.equals(lastLabel)){
                System.out.println(band.toStringWithOutLabel());
            }else{
                System.out.println(band.toString());
            }
            
            //update label name
            lastLabel = currLabel;
        }
    }
}
