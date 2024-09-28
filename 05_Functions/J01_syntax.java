
public class J01_syntax {

    // function definition
    static void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        printHello(); // function call
        System.out.println("Function calling done");
    }

    // if not using static while func declaration then our code might have looked
    // like this

    // public static void main(String[] args) {
    // J01_syntax obj = new J01_syntax();
    // obj.printHello(); // calling via object
    // System.out.println("Function calling done");
    // }

}
