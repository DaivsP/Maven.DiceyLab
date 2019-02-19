import org.junit.Test;

public class SimulationTest {

    @Test
    public void testSimulation(){
        //Given
        Simulation sim = new Simulation();

        //When
        sim.runSimulation(1000000);
    }
}
