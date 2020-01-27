import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testFizzOnOne() {
        String result = fizzBuzz.fizzBuzz(1);
        Assert.assertEquals(result, "1");
    }

    @Test
    void testFizzOnThree() {
        String result = fizzBuzz.fizzBuzz(3);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    void testFizzOnFive() {
        String result = fizzBuzz.fizzBuzz(5);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    void testFizzOnSix() {
        String result = fizzBuzz.fizzBuzz(6);
        Assert.assertEquals(result, "Fizz");
    }
}
