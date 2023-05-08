public class GetterAndSetter {
    public static void main(String args []){
        Pen p1 =new Pen();
        // p1.c("Blue");
        // System.out.println(p1.color);

        // System.out.println(p1.color);
        // p1.setColor("Red");
        // // 

        p1.setColor("Red");
        System.out.println(p1.getColor());

    }
    
}
class Pen {
    private String color;
    int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color = newColor;
    }
    
    // public void setColor(String newColor){
    //     color = newColor;
    // }
}
