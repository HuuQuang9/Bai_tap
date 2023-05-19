package factory_method.example1;

public class Client {
    public static void main(String[] args) {
        CreditCard creditCard = CardFactory.getCreditCard(CardType.Money_Back);
        System.out.println(creditCard.getCardType());
        System.out.println(creditCard.getCreditLimit());
        System.out.println(creditCard.getAnnualCharge());
    }
}
