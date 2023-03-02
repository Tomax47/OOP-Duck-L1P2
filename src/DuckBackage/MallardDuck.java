package DuckBackage;

public class MallardDuck extends Duck {

    MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FliWithWings();
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


    @Override
    public String toString() {
        return "Display : "+display()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age()+"\nFly : "+performFly()+"\nQuack : "+performQuack()+"\nWeight : "+weight();
    }

    @Override
    public String performFly() {
        return flyBehavior.getFly();
    }

    @Override
    public String performQuack() {
        return quackBehavior.getQuack();
    }

    @Override
    public double weight(){
        return 5;
    }
}
