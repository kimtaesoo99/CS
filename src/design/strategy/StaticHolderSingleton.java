package design.strategy;

public class StaticHolderSingleton {

    private StaticHolderSingleton(){}

    private static class SingleTonHolder {
        private static final StaticHolderSingleton instance = new StaticHolderSingleton();
    }

    public static StaticHolderSingleton getInstance(){
        return SingleTonHolder.instance;
    }
}
