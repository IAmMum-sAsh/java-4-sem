package pr5;

public class SingletonGetInstance {
    private SingletonGetInstance instance;

    public synchronized SingletonGetInstance getInstance() {
        if(instance == null) {
            instance = new SingletonGetInstance();
            return instance;
        }
        return instance;
    }
}
