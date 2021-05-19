package pr5;

public enum SingletonEnum {
    INSTANCE;
    public static SingletonEnum getInstance() {
        return INSTANCE;
    }
}
