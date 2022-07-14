public class NonVolatileDemo {

    public static boolean stop = false;

    public static void main(String[] args) throws Exception{
        Thread thread1 = new Thread(() -> {
            while (!stop){
                System.out.println("do somthing");
            }
            System.out.println("stop=true，满足停止条件。" +
                    "停止时间：" + System.currentTimeMillis());
        });
        thread1.start();

        Thread.sleep(100);
        stop=true;
        System.out.println("主线程设置停止标识 stop=true。" +
                "设置时间：" + System.currentTimeMillis());
    }
}
