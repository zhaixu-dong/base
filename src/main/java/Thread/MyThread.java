package Thread;

public class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                ///Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "正在运行" + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + i );
        }
    }
}
