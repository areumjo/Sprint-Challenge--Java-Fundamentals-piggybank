package local.areumjo;

public class Dollar extends PiggyBank
{

    public Dollar(int quantity)
    {
        super(quantity);
        this.worth = 1.00;
    }

    @Override
    public String toString() {
        return "$" + quantity;
    }
}
