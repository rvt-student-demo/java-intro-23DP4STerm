package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // Part 1: Testing single card operations
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);

        // Part 2: Testing non-negative balance
        PaymentCard card2 = new PaymentCard(5);
        System.out.println(card2);

        card2.eatHeartily();
        System.out.println(card2);

        card2.eatHeartily();
        System.out.println(card2);

        // Part 3: Testing adding money
        PaymentCard card3 = new PaymentCard(10);
        System.out.println(card3);

        card3.addMoney(15);
        System.out.println(card3);

        card3.addMoney(10);
        System.out.println(card3);

        card3.addMoney(200);
        System.out.println(card3);

        // Part 4: Topping up with a negative amount
        card3.addMoney(-15);
        System.out.println(card3);

        // Part 5: Multiple cards operations
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // Paul eats heartily
        paulsCard.eatHeartily();

        // Matt eats affordably
        mattsCard.eatAffordably();

        // Print card balances
        printCardBalances("Paul", paulsCard, "Matt", mattsCard);

        // Paul tops up 20 euros
        paulsCard.addMoney(20);

        // Matt eats heartily
        mattsCard.eatHeartily();

        // Print card balances
        printCardBalances("Paul", paulsCard, "Matt", mattsCard);

        // Paul eats affordably twice
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        // Matt tops up 50 euros
        mattsCard.addMoney(50);

        // Print final card balances
        printCardBalances("Paul", paulsCard, "Matt", mattsCard);
    }

    private static void printCardBalances(String name1, PaymentCard card1, String name2, PaymentCard card2) {
        System.out.println(name1 + ": " + card1);
        System.out.println(name2 + ": " + card2);
    }
}