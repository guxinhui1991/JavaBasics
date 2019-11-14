public class IManipulationImplementation implements IManipulation{
    private  double a;
    private  double b;

    public IManipulationImplementation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add(){
        return this.a + this.b;
    }
    public double subtract(){
        return this.a - this.b;
    }
}
