package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Si Ankol ");
        Polymorphism_Jay my_Jay = new Polymorphism_Jay ("Jay");
        Polymorphism_Angel my_Angel = new Polymorphism_Angel ("Angel");
        
        my_student.eat();
        my_Jay.sleep();
        my_Angel.coding();
        
        System.out.println("---------------------------------------");
        
        my_student.tae();
        my_Jay.studentCute();
        my_Angel.studentCute();
    }
}
