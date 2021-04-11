package pr5;

public class SingletonClassInClass {



    public static class SingletonHolder{
        public static final SingletonClassInClass HOLDER_INSTANCE = new SingletonClassInClass();
    }

    public static SingletonClassInClass getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }

}
