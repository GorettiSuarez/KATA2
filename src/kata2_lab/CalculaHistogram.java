package kata2_lab;

/**
 *
 * @author Goretti
 */
public class CalculaHistogram {

    public static <T> Histogram <T> computeHisto(T[] v){
        
        Histogram <T> histo = new Histogram<>();
        
        for (T key : v) {
            histo.incrementa(key);
        }
        
        return histo;
    }
}
