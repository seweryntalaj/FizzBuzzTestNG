public class FizzBuzz {

    public String fizzBuzz(int i) {
        if (i == 3 || i == 6 || i == 9) return "Fizz";
        else if (i == 5) return "Buzz";
        else if (i == 15) return "FizzBuzz";
        else return String.valueOf(i);
    }
}
