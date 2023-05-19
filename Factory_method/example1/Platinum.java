package factory_method.example1;

public class Platinum implements CreditCard{
    @Override
    public String getCardType() {
        return "Platinum";
    }

    @Override
    public int getCreditLimit() {
        return 35000;
    }

    @Override
    public int getAnnualCharge() {
        return 1500;
    }
}
