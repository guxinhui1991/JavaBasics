public class Hello {
    public static void main(String[] arguments) {
        // Program execution begins here
        System.out.println("Hello world.");

        //Calculation 1
        GravityCalc gravtity_calc1 = new GravityCalc();
        System.out.println(gravtity_calc1.calculation());

        //Calculation 2
        //Private variables within Class
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;

        GravityCalcWithParams gravtity_calc2 = new GravityCalcWithParams(gravity, initialVelocity, fallingTime, initialPosition);
        System.out.println(gravtity_calc2.calculation());

    }
}
