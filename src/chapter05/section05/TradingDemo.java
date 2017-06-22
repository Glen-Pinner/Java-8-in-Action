package chapter05.section05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TradingDemo {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan,  2012, 950)
        );

        // 1. Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> allTransactionsIn2011 = transactions.stream()
            .filter(transaction -> transaction.getYear() == 2011)
            .sorted(comparing(Transaction::getValue))
            .collect(Collectors.toList());

        System.out.println(allTransactionsIn2011);

        // 2. What are all the unique cities where the traders work?
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
        List<String> uniqueCities = traders.stream()
            .map(trader -> trader.getCity())
            .distinct()
            .collect(Collectors.toList());

        System.out.println(uniqueCities);

        // 3. Find all traders from Cambridge and sort them by name.
        List<String> traderFromCambridge = traders.stream()
            .filter(trader -> trader.getCity().equals("Cambridge"))
            .sorted(comparing(Trader::getName))
            .map(Trader::getName)
            .collect(Collectors.toList());

        System.out.println(traderFromCambridge);

        // 4. Return a string of all traders' names sorted alphabetically.
        List<String> traderNames = traders.stream()
            .sorted(comparing(Trader::getName))
            .map(trader -> trader.getName())
            .collect(Collectors.toList());

        System.out.println(traderNames);

        // 5/ Are any traders based in Milan?
        Optional<Trader> traderInMilan = traders.stream()
            .filter(trader -> trader.getCity().equals("Milan"))
            .findAny();

        traderInMilan.ifPresent(t -> System.out.println(t));

        // 6. Print all transactions' values from the traders living in Cambridge.
        List<Integer> tranactionValues = transactions.stream()
            .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
            .map(Transaction::getValue)
            .collect(Collectors.toList());

        System.out.println(tranactionValues);

        // 7. What's the highest value of all the transactions?
        int highestValueTransaction = transactions.stream()
            .map(transaction -> transaction.getValue())
            .reduce(0, Integer::max);

        System.out.println(highestValueTransaction);

        // 8. Find the transaction with the smallest value.
        Optional<Integer> smallestTransaction = transactions.stream()
            .map(transaction -> transaction.getValue())
            .reduce(Integer::min);

        smallestTransaction.ifPresent(t -> System.out.println(t));
    }
}
