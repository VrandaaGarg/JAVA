
public class J01_methodOverloading {
    static int abs(int a) {
        return (a > 0) ? a : -a;
    }

    static double abs(double a) {
        return (a > 0) ? a : -a;
    }

    static long abs(long a) {
        return (a > 0) ? a : -a;
    }

    public static void main(String[] args) {
        System.out.println("INT ABS: " + abs(-5));
        System.out.println("double abs " + abs(-5.5));
        System.out.println("long abs " + abs(-5L));
    }
}

// input datatype is different, but the method name is same
// so, this is called method overloading
// method overloading is a feature that allows a class to have more than one
// method having the same name, if their argument lists are different.
// here the output depend on the datatype of the input
