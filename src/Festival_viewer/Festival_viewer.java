/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Festival_viewer;

import Viewer_lib.Band;
import Viewer_lib.Festival;
import Viewer_lib.recordBuilder;
import static Viewer_lib.recordBuilder.formatOutput;
import java.util.List;


/**
 *
 * @author Darkside-PC
 * 
 * reference:
 * https://stackoverflow.com/questions/20534862/how-to-efficiently-map-a-org-json-jsonobject-to-a-pojo
 * https://stackoverflow.com/questions/23479332/import-json-url-to-java-and-parse-it-using-jackson-library
 * http://tutorials.jenkov.com/java-json/jackson-objectmapper.html#jackson-objectmapper-example
 * http://tutorials.jenkov.com/java-json/jackson-annotations.html
 * https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 * https://stackoverflow.com/questions/4805606/how-to-sort-by-two-fields-in-java
 */
public class Festival_viewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Festival> festivals = recordBuilder.apiRequester();
        List<Band> bands = recordBuilder.buildBands(festivals);
        formatOutput(bands);
    }
}
