package kata2_lab;

import java.util.HashMap;

/**
 *
 * @author Goretti
 */
public class KATA2_Lab {

   public static void main(String[] args) {
       int [] v = {1,1,1,5,3,4,8,9,100,9};
       
       Histogram histo = new Histogram(v);
       
       HashMap <Integer,Integer> histogram = histo.getHisto();
       
       for (int key : histogram.keySet()) {
           System.out.println(key + " : " + histogram.get(key));
       }
   }
    
}
