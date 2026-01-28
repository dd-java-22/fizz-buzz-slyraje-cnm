package edu.cnm.deepdive.fizzbuzz;

import static java.util.Map.entry;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Main {

  private static final Map<Set<FizzBuzz>, String> FIZZBUZZ_MAP = Map.ofEntries(
      entry(EnumSet.of(FizzBuzz.FIZZ), "Fizz"),
      entry(EnumSet.of(FizzBuzz.BUZZ), "Buzz"),
      entry(EnumSet.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ), "FizzBuzz")
      );

  static void main(String[] args) {
    int max = 100;
    int parsedArg;
    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }
    for (int i = 1; i < max; i++) {
      Set<FizzBuzz> result = FizzBuzz.fizzBuzz(i);
      System.out.println(FIZZBUZZ_MAP.getOrDefault(result,Integer.toString(i)));

    }
  }

}
