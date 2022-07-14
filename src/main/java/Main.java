public class Main {
    public static void main(String[] args) {
        final Bussiness bussiness = new Bussiness();
        //子线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    bussiness.subMethod();
                }
            }
        }).start(); //主线程
        for (int i = 0; i < 3; i++) {
            bussiness.mainMethod();
        }
    }


}
