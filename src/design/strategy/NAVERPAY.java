package design.strategy;

public class NAVERPAY implements PaymentStrategy{
    private String email;
    private String password;

    public NAVERPAY(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using NAVERPAY");
    }
}
