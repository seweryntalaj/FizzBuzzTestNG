import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    @Test
    void testFizzOnNine() {
        String result = fizzBuzz.fizzBuzz(9);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    void testFizzOnFifteen() {
        String result = fizzBuzz.fizzBuzz(15);
        Assert.assertEquals(result, "FizzBuzz");
    }

    @Test
    void testFizzOnStream() {
        IntStream intStream = IntStream.range(1, 101);
        List<Integer> numbers = intStream.boxed().collect(Collectors.toList());
        for (Integer n : numbers) {
            String result = fizzBuzz.fizzBuzz(n);

            if (n % 15 == 0) {
                Assert.assertEquals(result, "FizzBuzz");
            } else if (n % 5 == 0) {
                Assert.assertEquals(result, "Buzz");
            } else if (n % 3 == 0) {
                Assert.assertEquals(result, "Fizz");
            } else {
                Assert.assertEquals(result, n.toString());
            }
        }
    }
}
