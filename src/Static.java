public class Static {
    static{
        System.out.println("\n This is in side the static block");
    }

    static int i;

    static void staticMethod(){
        System.out.println("\n This is inside the static method the value of i"+i);
    }

    public static void main(String[] args) {
        Static.staticMethod();
    }

    static{

        System.out.println("\n Static method getting invoked inside the static block");
        Static.staticMethod();

    }
}
