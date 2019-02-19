public class Simulation {


    public Simulation() {

    }

    public void runSimulation(Integer numberOfRolls){
        Dice dice = new Dice(2);
        Bins bins = new Bins(2, 12);

        for (int i = 1; i <= numberOfRolls; i++) {
            bins.storeBins(dice.tossAndSum());
        }
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + " : " + bins.getBins(i));
        }
    }
}