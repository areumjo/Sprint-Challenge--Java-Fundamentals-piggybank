package local.areumjo;

public class Dime extends PiggyBank
{

    int quantity;
    double worth;

    public Dime(int quantity)
    {
        super(quantity);
        this.worth = 0.10;
    }

    @Override
    public String toString() {
        return "Dime{ " + "quantity= " + quantity + ", worth= $" + worth + " }";
    }
}
