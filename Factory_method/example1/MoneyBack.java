package factory_method.example1;

public class MoneyBack implements CreditCard{
    @Override
    public String getCardType() {
        return "MoneyBack";
    }

    @Override
    public int getCreditLimit() {
        return 1500;
    }

    @Override
    public int getAnnualCharge() {
        return 500;
    }
}
