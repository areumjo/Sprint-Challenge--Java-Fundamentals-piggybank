package local.areumjo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // instantiate - testing
        Dollar dollar = new Dollar(5);
        System.out.println("*** Testing out $$" + dollar.worth + ", quan: " + dollar.getQuantity() + " ***");

        Quarter quarter = new Quarter(4);
        System.out.println(quarter);
        System.out.println(dollar);


    }
}
