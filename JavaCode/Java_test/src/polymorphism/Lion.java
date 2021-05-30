package polymorphism;

public class Lion extends Animal{
    Lion(String name){
        this.name=name;
    }
    void eat() {
        System.out.print(name+" ");
        super.eat();
    }
}
