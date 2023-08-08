

package com.mycompany.animalproject;

public class AnimalProject {

    public static void main(String[] args) {
        Animal cat =new Animal("Cat",4,"male",4.5,"black","meow meow");
        cat.DisplayAllInformation();
        cat.sleep();
        cat.eat();
        cat.move();
        
        
    }
}
