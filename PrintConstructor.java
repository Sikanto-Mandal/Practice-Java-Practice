public class PrintConstructor{
    public static void main(String args[]){
        // Car c = new Car();
        // c.cost();

        Bike b = new Bike(100000);
        System.out.println(b.price);


    }

}
class Vehicle{
    Vehicle(){
        System.out.println("Vehicle Constructor called...");
    }
}
class Car extends Vehicle{
    
    Car(){
        System.out.println("Car constructor is called...");
    }
    void cost(){
        System.out.println("Car is very costly...");
    }
}
class Bike extends Car{
    int price;
    Bike(int price){
        this.price=price;
        System.out.println("Bike Constructor is called...");
    }

    
}
