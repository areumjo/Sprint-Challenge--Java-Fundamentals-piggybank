package local.areumjo;

public class Quarter extends PiggyBank
{

    int quantity;
    double worth;

    public Quarter(int quantity)
    {
        super(quantity);
        this.worth = 0.25;
    }

    @Override
    public String toString() {
        return "Quarter{ " + "quantity= " + quantity + ", worth= $" + worth + " }";
    }
}
