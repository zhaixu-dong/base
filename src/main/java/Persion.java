public class Persion implements Cloneable{

    private int age;
    private String name;

    public Persion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Persion p1 = new Persion(10,"张三");
        Persion p2 = p1;
        Persion p3 = (Persion) p1.clone();
        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p2);
        System.out.println(p2.getName());
        System.out.println(p3);
        System.out.println(p3.getName());
        System.out.println(p1.getName()==p2.getName());
    }



}
