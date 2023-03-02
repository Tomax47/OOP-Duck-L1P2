package DuckBackage;

public class MallardDuck extends Duck implements Quack,Fly {


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
    public boolean fly() {
        return true;
    }

    @Override
    public boolean quack() {
        return true;
    }

    @Override
    public String toString() {
        return "Display : "+display()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age()+"\nFly : "+fly()+"\nQuack : "+quack()+"\nWeight : "+weight();
    }

    @Override
    public double weight(){
        return 5;
    }
}
