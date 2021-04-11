package pr4;

public class Test {

    public static void main(String[] args){
        MyExecutorService MyService = new MyExecutorService(2);
        MyService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        MyService.submit(() -> System.out.println("Start"));
    }
}
