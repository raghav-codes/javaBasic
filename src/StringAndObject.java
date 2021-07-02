public class StringAndObject {
    public static void main(String[] args) {

        long x = 10000;

        Long y = Long.valueOf(x);

        String sLong= y.toString();

        Long l1 = Long.valueOf(sLong);

        System.out.println(x);
        System.out.println(sLong);
        System.out.println(l1);

        long l = 1000;

        Long l2 = new Long(2000);
        System.out.println(l2);

        String s2 = l2.toString();

        l2 = 1l;
        System.out.println(l2);
        System.out.println("\n String from Long:"+s2);

        int d = Math.toIntExact(l2);

        System.out.println("Long to int conversion"+d);

    }
}
