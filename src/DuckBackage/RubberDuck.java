package DuckBackage;

public class RubberDuck extends Duck{
    @Override
    public boolean quack() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

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
}
