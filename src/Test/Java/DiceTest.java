import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testSumAndToss() {
        //Given
        Dice dice = new Dice(2);

        //When
        Integer actual = dice.tossAndSum();

        //Then
        Boolean expected = false;
        if (actual >= 2 && actual <= 12) {
            expected = true;
        }
        Assert.assertTrue(expected);
    }
}
