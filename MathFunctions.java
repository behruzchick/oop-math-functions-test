public class MathFunctions {
    static double PI = 3.14159265359;
    static double E = 2.71828182846;


    public MathFunctions(double pi , double e) {
        PI = pi;
        E = e;
    }
    
    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double powerE(double a) {
        return Math.pow(E, a);
    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
