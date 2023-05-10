package design.singleton;

public class ThreadSafeLazySingleton {

    private static ThreadSafeLazySingleton instance = null;

    private ThreadSafeLazySingleton() {}

    public static synchronized ThreadSafeLazySingleton getInstance() {
        if(instance == null){
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }
}
