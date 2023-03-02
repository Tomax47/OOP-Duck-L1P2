package DuckBackage;

public class RedHeadDuck extends Duck implements Quack, Fly{


    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public String display() {
        return "It looks similar to the Millard duck!";
    }

    @Override
    public String origin() {
        return "South Carolina";
    }

    @Override
    public String color() {
        return "Red";
    }

    @Override
    public int age() {
        return 1;
    }


    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean quack() {
        return true;
    }

    @Override
    public String toString() {
        return "Display : "+display()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age()+"\nFly : "+fly()+"\nQuack : "+quack()+"Weight : "+weight();
    }

    @Override
    public double weight() {
        return 4.5;
    }
}
