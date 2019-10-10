package Task8;

class Operator {
    private static double x;
    private static double y;
    Operator(double x, double y){
        Operator.x = x;
        Operator.y = y;
    }
    static double addition(double x, double y){
        return x +y;
    }
    static double subtraction(double x, double y){
        return x - y;
    }
    static double multiplication(double x, double y){
        return x * y;
    }
    static double division(double x, double y) {
        return x / y;
    }
    static double percent(double x, double y){
        return x / 100 * y;
    }
}
