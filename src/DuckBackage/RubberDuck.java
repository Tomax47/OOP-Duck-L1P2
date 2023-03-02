package DuckBackage;

public class RubberDuck extends Duck implements Quack{


    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public String display() {
        return "A small duck made out of rubber with orange picker!";
    }

    @Override
    public String origin() {
        return "Toy factories";
    }

    @Override
    public String color() {
        return "Yellow";
    }

    @Override
    public int age() {
        return 100;
    }


    @Override
    public boolean quack() {
        return true;
    }

    @Override
    public String toString() {
        return "Display : "+display()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age()+"\nQuack : "+quack()+"\nWeight : "+weight();
    }

    @Override
    public double weight() {
        return 0.150;
    }
}
