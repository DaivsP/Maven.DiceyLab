import java.util.TreeMap;

public class Bins {
    Dice dice = new Dice(2);

    private TreeMap<Integer, Integer> bins;

    public Bins() {


        bins = new TreeMap<Integer, Integer>();
    }

    public TreeMap<Integer, Integer> getTreeMap() {
        return bins;
    }

    public void setTreeMap(TreeMap<Integer, Integer> treeMap) {
        this.bins = bins;
    }

    public void storeBins(){
        if (dice.tossAndSum() == 2){
            bins.put(2, +1);
        }
        else if (dice.tossAndSum() == 3){
            bins.put(3, +1);
        }
        else if (dice.tossAndSum() == 4){
            bins.put(4, +1);
        }
        else if (dice.tossAndSum() == 5){
            bins.put(5, +1);
        }
        else if (dice.tossAndSum() == 6){
            bins.put(6, +1);
        }
        else if (dice.tossAndSum() == 7){
            bins.put(7, +1);
        }
        else if (dice.tossAndSum() == 8){
            bins.put(8, +1);
        }
        else if (dice.tossAndSum() == 9){
            bins.put(9, +1);
        }
        else if (dice.tossAndSum() == 10){
            bins.put(10, +1);
        }
        else if (dice.tossAndSum() == 11){
            bins.put(11, +1);
        }
        else if (dice.tossAndSum() == 12){
            bins.put(12, +1);
        }
    }
}