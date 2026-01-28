package edu.cnm.deepdive.fizzbuzz;

public class FizzBuzz {

  public String fizzBuzz(int position) {
    boolean isFizz = position % 3 == 0;
    boolean isBuzz = position % 5 == 0;
    if (isFizz && isBuzz) {
      return "FizzBuzz";
    } else if (isFizz) {
      return "Fizz";
    } else if (isBuzz) {
      return "Buzz";
    } else {
      return Integer.toString(position);
    }
  }

  static void main(String[] args) {
    int max = 100;
    int parsedArg;
    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int i = 0; i < max; i++) {
      System.out.println(new FizzBuzz().fizzBuzz(i + 1));

    }
  }
}
