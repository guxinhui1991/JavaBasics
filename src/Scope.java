public class Scope {
    public void testScope(){
        int x = 5;
        int y = 6;
        if (x == 5){
            x = 6;
            y = 72;
            System.out.println("x = " + x + " y = " + y);
        }
        System.out.println("x = " + x + " y = " + y);
    }
}