package kata2_lab;

import java.util.HashMap;

/**
 *
 * @author Goretti
 */
public class Histogram {
    
    private final int [] v;
    
    Histogram(int[] v) {
        this.v=v;
    }
    
    public HashMap<Integer,Integer> getHisto(){
        HashMap<Integer,Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < v.length; i++) {
             if(histogram.containsKey(v[i])){
                histogram.put(v[i], histogram.get(v[i])+1);                        
            } else {
                histogram.put(v[i],1);
            }
        }
        
        return histogram;
    }
    
}
