public class StaticDemo {
    static StaticDemo staticDemo;

    static{
        System.out.println("\n"+staticDemo);
        staticDemo = new StaticDemo();


    }

    public static void main(String[] args) {
        System.out.println(staticDemo);

    }
}
