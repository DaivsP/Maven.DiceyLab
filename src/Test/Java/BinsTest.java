import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void testStoreBins(){
        //Given
        Bins bins = new Bins(2,12);

        //When
        bins.storeBins(5);
        Integer actual = bins.getBins(5);

        //Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
