import java.util.TreeMap;

public class Bins {
    Dice dice = new Dice(2);

    private TreeMap<Integer, Integer> bins;

    public Bins(Integer minRoll, Integer maxRoll) {
        bins = new TreeMap<>();
        for (int i = minRoll; i <= maxRoll; i++) {
            bins.put(i, 0);
        }
    }

    public Integer getBins(Integer binNumber) {
        return bins.get(binNumber);
    }


    public void storeBins(Integer result){
        bins.put(result, bins.get(result) + 1);
    }
}