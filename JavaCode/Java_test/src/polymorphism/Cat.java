package polymorphism;

public class Cat extends Animal{
     Cat(String name){
         this.name=name;
     }

    @Override
    void eat() {
        System.out.print(name+" ");
         super.eat();
    }
}
