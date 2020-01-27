import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testFizzOnOne() {
        String result = fizzBuzz.fizzBuzz(1);
        Assert.assertEquals(result, "1");
    }
}
