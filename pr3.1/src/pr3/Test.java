package pr3;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        LockMap myMap = new LockMap();
        SynchronizedSet mySet = new SynchronizedSet();

        Thread oneM = new Thread(()->{
            for (int i=0; i < 5000; i++){
                myMap.put(i, i*i);

            }
        });

        Thread twoM = new Thread(()->{
            for (int i=0; i < 5000; i++){
                myMap.put(i, i*i);
            }
        });

        oneM.start();
        twoM.start();
        Thread.sleep(3000);
        System.out.println("myMap.size() = " + myMap.size());


        Thread oneS = new Thread(()->{
            for (int i=0; i < 5000; i++){
                mySet.add(i);

            }
        });

        Thread twoS = new Thread(()->{
            for (int i=0; i < 5000; i++){
                mySet.add(i);
            }
        });

        oneS.start();
        twoS.start();
        Thread.sleep(3000);
        System.out.println("mySet.size() =  " + mySet.size());
    }

}
