package edu.cnm.deepdive.fizzbuzz;

import java.util.Set;

public class Main {

  static void main(String[] args) {
    int max = 100;
    int parsedArg;
    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }
    for (int i = 1; i < max; i++) {
      Set<FizzBuzz> result = FizzBuzz.fizzBuzz(i);
      if (result.contains(FizzBuzz.FIZZ)) {
        System.out.print("Fizz");
      }
      if (result.contains(FizzBuzz.BUZZ)) {
        System.out.print("Buzz");
      }
      if (result.isEmpty()) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

}
