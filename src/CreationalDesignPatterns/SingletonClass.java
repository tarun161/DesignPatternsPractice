package CreationalDesignPatterns;


public class SingletonClass {
    private static SingletonClass singletonInstance = null;

    private SingletonClass() {
    }

    /**
     * Instead of making method as synchronized we will have synchronize check inside the method to reduce latency for multi threads
     */
    private SingletonClass getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (singletonInstance) {
                if (singletonInstance == null) {
                    singletonInstance = new SingletonClass();
                    return singletonInstance;
                } else
                    return singletonInstance;
            }
        }
        return singletonInstance;
    }

}
