package factory_method.example1;

public class CardFactory {
    private CardFactory(){};
    public static CreditCard getCreditCard(CardType cardType){
        switch (cardType){
            case Money_Back:
                return new MoneyBack();
            case Platinum:
                return new Platinum();
            case Titanium:
                return new Titanium();
            default:
                return null;
        }
    }
}
