package local.areumjo;

public abstract class PiggyBank
{
    int quantity;
    double worth;

    public PiggyBank(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getWorth()
    {
        return worth * quantity;
    }

    public void setWorth(double worth)
    {
        this.worth = worth;
    }

}
