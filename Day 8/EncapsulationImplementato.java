class Encapsulation{
    int a;
    Encapsulation(){
        a=10;
    }
    void display(){
        System.out.println("Value of a: "+a);
    }
}
public class EncapsulationImplementato {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.display();  
    }
}
