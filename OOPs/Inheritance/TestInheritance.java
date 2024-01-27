class Animal {
        void eat()      // Single Inheritance
        {               // Only Dog can Inherit the property of Animal
                System.out.println("Eating...");
        }
}
class Dog extends Animal{
        void bark()
        {
                System.out.println("Barking...");
        }
}
class TestInheritance {
        public static void main(String args[]){
                Dog d = new Dog();      // Only Dog can Inherit the property of Animal
                d.bark();                
                d.eat();
}
}
