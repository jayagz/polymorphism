package polymorphism;

public class Polymorphism_Jay extends Polymorphism_Student{ //child class
    Polymorphism_Jay(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name + " kay galisod ug tulog");
    }
    public void studentCute(){
        System.out.println("Ang cute mo talaga " + name);
    }
    
}
