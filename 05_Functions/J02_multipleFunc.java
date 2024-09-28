
public class J02_multipleFunc {

    static void India() {
        System.out.println("Hello! I am in India");
    }

    static void USA() {
        System.out.println("Hello! I am in USA");
        India();

    }

    static void UK() {
        System.out.println("Hello! I am in UK");
        Canada();
    }

    static void Canada() {
        System.out.println("Hello! I am in Canada");
    }

    public static void main(String[] args) {
        System.out.println("I am in main func");
        India();
        USA();
        UK();
        Canada();
        System.out.println("I am again back in main func");
    }
}

// conclusion:
// Here it doesnt matter where the function is defined, we can call it from
// anywhere in the code.
// also even if function is defined afterwards in code we can call it before its
// definition.
// like we did in UK() function. We called Canada() function before its
// definitio]
