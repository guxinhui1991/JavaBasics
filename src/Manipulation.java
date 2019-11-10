public class Manipulation {
    int a;
    int b;

    public Manipulation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Manipulation() {
    }

    public int calculation(){
        return this.a * this.b;
    }

    public int calculation(int a){
        return a * this.b;
    }

}

class Addition extends Manipulation{
    public Addition(int a, int b) {
        this.a = a + 1;
        this.b = b + 1;
    }

    public int calculation(){
        return this.a + this.b;
    }
}
