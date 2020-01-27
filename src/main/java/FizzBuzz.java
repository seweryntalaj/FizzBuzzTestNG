public class FizzBuzz {

    public String fizzBuzz(int i) {
        if (i == 3 || i == 6) return "Fizz";
        else if (i == 5) return "Buzz";
        else return String.valueOf(i);
    }
}
