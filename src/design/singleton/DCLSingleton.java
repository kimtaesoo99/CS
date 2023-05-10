package design.singleton;

public class DCLSingleton {

    private volatile static DCLSingleton instance = null;

    private DCLSingleton() {}

    public static DCLSingleton getInstance() {
        if(instance == null){
            synchronized(DCLSingleton.class){
                if(instance == null){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
