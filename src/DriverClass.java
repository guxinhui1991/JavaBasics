import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class DriverClass {
    public static void main(String[] arguments) {
        // Program execution begins here
        System.out.println("Hello world.");

        //Calculation 1
        GravityCalc gravity_calc1 = new GravityCalc();
        System.out.println(gravity_calc1.calculation());

        //Calculation 2
        //Private variables within Class
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;

        GravityCalcWithParams gravity_calc2 = new GravityCalcWithParams(gravity, initialVelocity, fallingTime, initialPosition);
        System.out.println(gravity_calc2.calculation());


        // Scope
        Scope testScope = new Scope();
        System.out.println("Testing Scope");
        testScope.testScope();

        //Inheritance Example
        Manipulation sample_manipulation1 = new Manipulation(1, 100);
        Manipulation sample_manipulation2 = new Addition(1, 100);
        Addition sample_manipulation3 = new Addition(1, 100);
        System.out.println(sample_manipulation1.a);
        System.out.println(sample_manipulation2.a);
        System.out.println(sample_manipulation3.calculation());


        //Polymorphism Example
        Manipulation sample_manipulation4 = new Addition(1, 100);


        //Method Overriding
        Manipulation sample_manipulation5 = new Manipulation(1, 100);
        Manipulation sample_manipulation6 = new Addition(1, 100);
        Addition sample_manipulation7 = new Addition(1, 100);
        Manipulation sample_manipulation8 = new Addition(1, 100);
        Addition sample_manipulation9 = new Addition(1, 100);
        System.out.println("5: " + Integer.toString(sample_manipulation5.calculation()));
        System.out.println("6: " + Integer.toString(sample_manipulation6.calculation()));
        System.out.println("7: " + Integer.toString(sample_manipulation7.calculation()));
        System.out.println("8: " + Integer.toString(sample_manipulation8.calculation(2)));
        System.out.println("9: " + Integer.toString(sample_manipulation9.calculation(2)));

        //Interface

    }
}


class GravityCalc {
    public GravityCalc() {
    }

    public double calculation() {
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = .5 * gravity * fallingTime *
                fallingTime;

        finalPosition = finalPosition + initialVelocity * fallingTime;
        finalPosition = finalPosition + initialPosition;
        System.out.println("An object's position after " + fallingTime + " seconds is " + finalPosition + "m.");

        return finalPosition;
    }
}

class GravityCalcWithParams {
    private double gravity;
    private double initialVelocity;
    private double fallingTime;
    private double initialPosition;


    public GravityCalcWithParams(double gravity, double initialVelocity, double fallingTime, double initialPosition) {
        this.gravity = gravity;
        this.initialVelocity = initialVelocity;
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
    }

    public double getGravity() {
        return gravity;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public double getFallingTime() {
        return fallingTime;
    }

    public double getInitialPosition() {
        return initialPosition;
    }

    public double calculation(){
        double finalPosition = .5 * gravity * fallingTime * fallingTime;
        return finalPosition;
    }
}

