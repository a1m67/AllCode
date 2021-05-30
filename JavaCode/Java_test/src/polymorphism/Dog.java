package polymorphism;

public class Dog extends Animal {
    Dog(String name){
        this.name =name;
    }

    @Override
    void eat() {
        System.out.print(name+" ");
        super.eat();
    }
}
