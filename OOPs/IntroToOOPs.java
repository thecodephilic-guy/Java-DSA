package OOPs;

public class IntroToOOPs {
    public static void main(String[] args) {
        Pen newPen = new Pen();

        newPen.setColor("Red");
        System.out.println(newPen.color);

        newPen.setTip(7);
        System.out.println(newPen.tip);
    }
}

class Pen{

    String color;
    int tip;

    Pen(){
        color = "Blue";
    }

    void setColor(String newName){
        this.color = newName;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
