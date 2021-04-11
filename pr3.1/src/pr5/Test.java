package pr5;

public class Test {

    public static void main(String[] args){
        SingletonGetInstance firstSingle = new SingletonGetInstance();
        firstSingle.getInstance();

        SingletonEnum.getInstance();

        SingletonClassInClass thirdSingle = new SingletonClassInClass();
        thirdSingle.getInstance();

        System.out.println();
    }

}
// 19И0865