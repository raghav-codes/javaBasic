public class PrimitiveAndObject {
    public static void main(String[] args) {
        int i = 100;
        Integer y = Integer.valueOf(i);
        int z = y.intValue();

        System.out.println(i);
        System.out.println(y);
        System.out.println(z);

        byte b1 = 100;

        String s = Byte.toString(b1);

        byte b2 = Byte.parseByte(s);


        System.out.println(s);
        System.out.println(b2);



    }
}
