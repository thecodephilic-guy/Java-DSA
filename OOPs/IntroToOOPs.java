package OOPs;

public class IntroToOOPs {
    public static void main(String[] args) {
        Pen newPen = new Pen();

        newPen.setColor("Red");
        // System.out.println(newPen.color); //this will trough error if acces specifier is private

        newPen.setTip(7);
        // System.out.println(newPen.tip);  //this will trough error if acces specifier is private

        // newPen.color = "Black";     //This prop is changable from main function (A security issue)
        
        //We need to know about access modifiers
        
        System.out.println(newPen.getColor());
        System.out.println(newPen.getTip());

        Pen copyPen = new Pen(newPen);
        System.out.println(copyPen.getColor());
        System.out.println(copyPen.getTip());
    }
}

class Pen{

    private String color;
    private int tip;

    //this is called constructor. It is called at the time of creation of a new object.
    //There are 3 types of constructors:
    //  Non-parameterised
    //  Parameterised
    //  Copy

    /*
        Let's read about copy constructor:
        The work of a copy constructor is to copy the properties of one object to another object
     */


    //Shallow copy constructor if array was involed
    Pen(Pen newPen){    //Passing an object of same class as parameter
        this.color = newPen.color;
        this.tip = newPen.tip;
    }

    //Deep copy constructor:

    Pen(){
        color = "Blue";
    }

    void setColor(String color){     //setter method
        this.color = color;
    }

    void setTip(int tip){           //setter method
        this.tip = tip;
    }

    String getColor(){          //getter method
        return this.color;
    }

    int getTip(){           //getter method
        return this.tip;
    }
}