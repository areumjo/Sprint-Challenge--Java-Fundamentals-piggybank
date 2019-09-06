package local.areumjo;

public class Quarter extends PiggyBank
{

    public Quarter(int quantity)
    {
        super(quantity);
        this.worth = 0.25;
    }

    @Override
    public String toString() {
        return quantity + " Quarter";
    }
}
