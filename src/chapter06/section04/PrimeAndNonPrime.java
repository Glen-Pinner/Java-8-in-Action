package chapter06.section04;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class PrimeAndNonPrime {

    public static void main(String[] args) {
        System.out.println(new PrimeAndNonPrime().partitionedPrimes(30));
    }

    public Map<Boolean, List<Integer>> partitionedPrimes(int n) {
        return IntStream.rangeClosed(2, n)
            .boxed()
            .collect(partitioningBy(candidate -> isPrime(candidate)));
    }

    public boolean isPrime(int candidate) {
//        return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
    }
}
