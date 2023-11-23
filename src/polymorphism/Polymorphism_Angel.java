package polymorphism;

public class Polymorphism_Angel extends Polymorphism_Student{   //child class
    Polymorphism_Angel(String name){
        super(name);
    }
    void coding(){
        System.out.println(name + " kay programmer HelloWorld(Print)");
    }    
    public void studentCute(){
        System.out.println("Ang cute mo talaga " + name);
    }
}
