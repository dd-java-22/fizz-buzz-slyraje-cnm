package edu.cnm.deepdive.fizzbuzz;

public class Main {

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
