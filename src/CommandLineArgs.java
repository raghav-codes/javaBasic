public class CommandLineArgs {
    public static void main(String[] args) {
        int length = args.length;
        if (length == 0)
            System.out.println("No Args Provided");
        else {
            System.out.println("Argument provided" + length);
            for (String str : args) {
                System.out.println(args);

            }
        }
    }
}
