package DuckBackage;

public class MallardDuck extends Duck{
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
        return "It looks like the RedHead duck!";
    }

    @Override
    public String origin() {
        return "Australia";
    }

    @Override
    public String color() {
        return "White";
    }

    @Override
    public int age() {
        return 2;
    }
}
