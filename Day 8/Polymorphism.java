class Animal{
   public void sound(){
        System.out.println("Animal makes a sound");
   }
}
class Cat extends Animal{
     public void sound(){
        System.out.println("Meow");
      }
}


public class Polymorphism {
      public static void main(String[] args) {
         Animal myAnimal = new Animal();
         myAnimal.sound(); // Output: Animal makes a sound
   
         Cat myCat = new Cat();
         myCat.sound(); // Output: Meow
   
         // Polymorphism in action
         Animal myPolymorphicAnimal = new Cat();
         myPolymorphicAnimal.sound(); // Output: Meow\
      }
}
