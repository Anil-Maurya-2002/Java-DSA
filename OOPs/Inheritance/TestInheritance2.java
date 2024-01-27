class Animal {
void eat(){           //  Multilevel Inheritance
System.out.println("Animal eating...");
}                      // Dog Inherit the property of Animal
}

class Dog extends Animal{
void bark(){
System.out.println("Dog barking...");
}
}

class BabyDog extends Dog{
void weep(){
System.out.println("Weeping...");
}
}

class TestInheritance2 {
public static void main (String args[]){
Dog d = new Dog();            // Dog can Inherit the property of Animal only
d.bark();
d.eat();

BabyDog b = new BabyDog();    // BabyDog can Inherit the property of Dog and Animal
b.weep();
b.bark();
b.eat();
}
}