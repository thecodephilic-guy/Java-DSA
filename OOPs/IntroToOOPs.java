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
    }
}

class Pen{

    private String color;
    private int tip;

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