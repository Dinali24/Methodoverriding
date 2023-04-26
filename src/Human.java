
public class Human {
    void run(){
        System.out.println("Human can Eat!!!");
    }
}
class Dinali extends Human {
    void run() {
        System.out.println("Dinali can Eat!!");
    }

    public static void main(String[] args) {
        Dinali d  = new Dinali();
        d.run();

    }

}