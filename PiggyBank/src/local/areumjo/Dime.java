package local.areumjo;

public class Dime extends PiggyBank
{

    public Dime(int quantity)
    {
        super(quantity);
        this.worth = 0.10;
    }

    @Override
    public String toString() {
        if (quantity == 1)
        {
            return quantity + " Dime";
        } else
        {
            return quantity + " Dimes";
        }
    }
}
