package local.areumjo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // instantiate - testing
        Dollar dollar = new Dollar(5);
        System.out.println("*** Testing out $$" + dollar.worth + ", quan: " + dollar.getQuantity() + " ***");

        Quarter quarter = new Quarter(4);
        System.out.println(quarter);
        System.out.println(dollar);
        System.out.println();

        // combining classes - D, Q, D, N, P
        ArrayList<PiggyBank> piggyBank = new ArrayList<PiggyBank>();
        piggyBank.add(new Quarter(1));
        piggyBank.add(new Dime(1));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));

        System.out.println("*** Print the contents of the Piggy Bank ***");
        piggyBank.forEach(c -> System.out.println(c));
        System.out.println();

    }
}
