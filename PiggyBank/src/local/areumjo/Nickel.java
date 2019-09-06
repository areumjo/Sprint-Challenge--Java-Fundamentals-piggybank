package local.areumjo;

public class Nickel extends PiggyBank
{

    int quantity;
    double worth;

    public Nickel(int quantity)
    {
        super(quantity);
        this.worth = 0.05;
    }

    @Override
    public String toString() {
        return "Nickel{ " + "quantity= " + quantity + ", worth= $" + worth + " }";
    }
}
