public class AppBenito {
    public static void main(String[] args) {
        int a = 15;
        String name = "something";
        System.out.println(say());
        System.out.println(sum(65, 5));
    }

    private static String say(){
        return "Hello!";
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public String run() {
        return "Running...";
    }
}
