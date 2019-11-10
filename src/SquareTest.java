class SquareTest {
    public static void printSquare(int x){
        System.out.println(x*x);
    }
    public static void main(String[] arguments){
        int value = 2;
        printSquare(value);
        printSquare(3);
        printSquare(value*2);
    }
}

class SquareTest2 {
    public static void printSquare(int x){
        System.out.println(x*x);
    }
    public static void main(String[] arguments){
        //printSquare("hello");
        //printSquare(5.5);
    }
}

class SquareTest3 {
    public static void printSquare(double x){
        System.out.println(x*x);
    }
    public static void main(String[] arguments){
        printSquare(5);
    }
}

class SquareTest4 {
    public static double square(double x){
        return x*x;
    }
    public static void main(String[] arguments){
        System.out.println(square(5));
        System.out.println(square(2));
    }
}

class SquareChange {
    public static void printSquare(int x){
        System.out.println("printSquare x = " + x);
        x = x * x;
        System.out.println("printSquare x = " + x);
    }
    public static void main(String[] arguments){
        int x = 5;
        System.out.println("main x = " + x);
        printSquare(x);
        System.out.println("main x = " + x);
    }
}


class Multiply {
    public static void times (double a, double b){
        System.out.println(a * b);
    }
    public static void main(String[] arguments){
        times (2, 2);
        times (3, 4);
    }
}