package local.areumjo;

public class Penny extends PiggyBank
{

    int quantity;
    double worth;

    public Penny(int quantity)
    {
        super(quantity);
        this.worth = 0.01;
    }

    @Override
    public String toString() {
        return "Penny{ " + "quantity= " + quantity + ", worth= $" + worth + " }";
    }
}
