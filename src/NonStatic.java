public class NonStatic {
    int i;

    public NonStatic(int i) {
        this.i = i;
        System.out.println("\n This is inside the AllArgsConstructor.");
    }

    static {
        System.out.println("\n This is inside the static block.");
    }

    {
        System.out.println("\n This is inside the non-static block.");
    }

    public static void main(String[] args) {

        System.out.println("\n Inside the main method.");
        NonStatic nonStaticArgs = new NonStatic(5);
        NonStatic nonStaticNoArgs = new NonStatic(10);
    }
}
