package DuckBackage;

public class MuteDuck implements QuackBehavior{
    @Override
    public String getQuack() {
        return "The duck is mute, it doesn't quack!";
    }
}
