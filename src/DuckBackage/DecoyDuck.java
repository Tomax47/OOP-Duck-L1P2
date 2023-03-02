package DuckBackage;

public class DecoyDuck extends Duck{
    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public String display() {
        return "It looks like normal ducks!";
    }

    @Override
    public String origin() {
        return "Factory made";
    }

    @Override
    public String color() {
        return "White & green";
    }

    @Override
    public int age() {
        return 12;
    }

    @Override
    public String toString() {
        return "Display : "+display()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age()+"Weight : "+weight();
    }

    @Override
    public double weight() {
        return 2.15;
    }
}
