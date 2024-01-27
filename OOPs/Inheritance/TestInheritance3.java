import org.w3c.dom.stylesheets.StyleSheetList;

class Animal{                      //  Hierarchical Inheritance
void eat(){
System.out.println("Eating properti of animal...");
}
}

class Dog extends Animal{
void bark(){
System.out.println("Barking of dog...");
}
}

class Cat extends Animal{
void meow(){
System.out.println("Meowing of cat...");
}
}

class TestInheritance3{
public static void main (String args[]){
Cat c = new Cat();     // Cat can Inherit the property of Animal only.But,Cat not inherit Dog properti
c.eat();
c.meow();

Dog d = new Dog();     // Dog can Inherit the property of Animal only
d.eat();
d.bark();
}       
}