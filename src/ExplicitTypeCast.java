public class ExplicitTypeCast {
    public static void main(String[] args) {
        int i  = 100;
        byte b = (byte) i;

        char ch = (char)i;

        System.out.println("\n Explicit typecast from Integer to Bype : "+b);

        System.out.println("\n Explicit typecast from Integer to Case :" +ch);

        i  = 612;
        b = (byte) 20;
        ch = (char)i;

        System.out.println("\n Explicit typecast from Integer to Bype : "+b);

        System.out.println("\n Explicit typecast from Integer to Case :" +ch);
    }

}
