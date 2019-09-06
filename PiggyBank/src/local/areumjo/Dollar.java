package local.areumjo;

public class Dollar extends PiggyBank
{

    int quantity;
    double worth;

    public Dollar(int quantity)
    {
        super(quantity);
        this.worth = 1.00;
    }

    @Override
    public String toString() {
        return "Dollar{ " + "quantity= " + quantity + ", worth= $" + worth + " }";
    }
}
