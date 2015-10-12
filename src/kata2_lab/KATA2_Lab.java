package kata2_lab;

import java.util.HashMap;

/**
 *
 * @author Goretti
 */
public class KATA2_Lab {

    public static void main(String[] args) {
        //int [] v = {1,1,1,5,3,4,8,9,100,9};
        Integer [] v = {1,1,1,5,3,4,8,9,100,9};
        String [] nombres = {"Ana","Juan","Ana","Pedro","Pedro","Pedro", "Dani guapo"};
       
        Histogram<Integer> histogram = CalculaHistogram.computeHisto(v);
        Histogram<String> histogram2 = CalculaHistogram.computeHisto(nombres);

       
       for (Object key : histogram.keySet()) {
           System.out.println(key + " : " + histogram.get(key));
       }
       
       for (Object key : histogram2.keySet()) {
           System.out.println(key + " : " + histogram2.get(key));
       }
   }
    
}
