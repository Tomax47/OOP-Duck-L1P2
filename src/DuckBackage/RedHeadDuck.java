package DuckBackage;

public class RedHeadDuck extends Duck{
    @Override
    public boolean quack() {
        return true;
    }

    @Override
    public boolean fly() {
        return true;
    }

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
}
