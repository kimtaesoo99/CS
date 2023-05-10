package design.strategy;

public class KAKAOCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;

    public KAKAOCardStrategy(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KAKAOCard.");
    }
}
