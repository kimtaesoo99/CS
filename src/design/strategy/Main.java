package design.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("apple",100);
        Item B = new Item("banana",200);

        cart.addItem(A);
        cart.addItem(B);

        cart.pay(new KAKAOCardStrategy("kakao","123"));
//        300 paid using KAKAOCard.

        cart.pay(new NAVERPAY("kimtaesoo7@naver.com","1234"));
//        300 paid using NAVERPAY
    }
}
