public class GravityCalcWithParams {
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
