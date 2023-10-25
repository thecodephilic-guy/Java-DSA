package OOPs;

/*
        Abstract Class:

        - Cannot create an instance of abstract class
        - Can have abstract/non-abstract methods
        - Can have constructors
*/

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.skinColor);    //Brown
        h.changeSkinColor();
        System.out.println(h.skinColor);    //Dark Brown

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.skinColor);    //Brown
        c.changeSkinColor();
        System.out.println(c.skinColor);    //Orange
    }
    
}


abstract class Animal {
    String skinColor;

    //This constructor will be called whenever we make a new object of the class which extends this Animal class.
    Animal() {
        skinColor = "Brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }

    //We don't have to write the implementation of the abstract methods within the class but they are defined by their sub-classes
    abstract void walk();
}

class Horse extends Animal {
    //now as Horse class extends a class which have an abstract method in it. So it becomes mendatory for the horse class to implement it.

    void walk(){
        System.out.println("Walks on 4 legs");
    }

    void changeSkinColor() {
        skinColor = "Dark Brown";
    }
}

class Chicken extends Animal {
    //It is mendatory for the Chicken class also to implement the walk funtion:

    void walk() {
        System.out.println("Walks on 2 legs");
    }

    void changeSkinColor() {
        skinColor = "Orange";
    }
}

//NOTE: In case of inheritance the top level constructor is called first and then followed by the children.