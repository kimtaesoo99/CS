package design.strategy;

public class Main {
    public static void main(String[] args) {
        StaticHolderSingleton instance1 = StaticHolderSingleton.getInstance();
        StaticHolderSingleton instance2 = StaticHolderSingleton.getInstance();
        System.out.println(instance1 == instance2); //ture
    }
}
