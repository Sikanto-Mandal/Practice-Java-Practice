public class Abstraction {
public static void  main(String argss[]){
    Tranport t = new Tranport();
    t.start();

}
    
}
abstract class Car{
    int noOftyres =4;
    abstract void start();
}
class Tranport extends Car{
    void start(){
        System.out.println("Starting with key...");
    }

}
