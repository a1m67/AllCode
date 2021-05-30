package polymorphism;

public class AnimalTest {
    public static void main(String []args){
        Animal []a = new Animal[5];
        a[0] =new Lion("Lion");
        a[1] =new Dog("Dog");
        a[2] = new Cat("Cat");
        a[3]=new Lion("Lion Baby");
        a[4] =new Dog("Dog Baby");
        for (Animal animal : a){
            animal.eat();
        }
    }
}
