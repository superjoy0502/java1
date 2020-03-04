public class WhyMethod {
    public static void main(String[] args) { //인자, argument

        // 100000000
        printTwoTimesA("a", "-");
        // 100000000
        printTwoTimesA("a", "*");
        // 100000000
        printTwoTimesA("a", "&");
        printTwoTimesA("b", "!");

    }

    public static void printTwoTimesA(String text, String delimiter) { // 매개변수,parameter
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}
