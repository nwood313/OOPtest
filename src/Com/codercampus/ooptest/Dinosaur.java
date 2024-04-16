package Com.codercampus.ooptest;

public class Dinosaur {
    String color;
    String weight;
    String length;

    String getDetails() {
        return "Color: "+ color +", Weight: "+ weight+", Length: "+length;

    }
    void setDetails(String color,String length,String weight) {
        this.color=color;
        this.weight=weight;
        this.length=length;
    }
}
