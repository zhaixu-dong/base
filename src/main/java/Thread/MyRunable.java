package Thread;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "正在运行" + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        new Thread(mr,"aaaaaa").start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + i );
        }
    }
}
