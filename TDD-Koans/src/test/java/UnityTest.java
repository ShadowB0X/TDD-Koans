import org.example.Utilities;
import org.junit.Assert;
import org.junit.Test;

//import javax.swing.text.Utilities;

public class UnityTest {


    @Test
    public void testTrailingZeroes()
    {
        int input = 3;
        int actual = 0;
        int expected = 3000000;

        actual = Utilities.addTrailingZeroes(input);

        Assert.assertEquals(actual, expected);
    }


}
