public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String[] temperatures = new String[5];

        // temperatures[] = {"","",",",""}

        temperatures[0] = "32 C";
        temperatures[1] = "0 C";
        temperatures[2] = "10 C";
        temperatures[3] = "-20 C";
        temperatures[4] = "15 C";

        temperatures[2] = "60 c";

        for (String temp : temperatures) {

            System.out.println(temp);

        }

    }
}
