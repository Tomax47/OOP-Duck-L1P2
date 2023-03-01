package DuckBackage;

public abstract class Duck {

    public Duck(){}

    public abstract boolean quack();
    public abstract boolean fly();
    public abstract boolean swim();
    public abstract String display();
    public abstract String origin();
    public abstract String color();
    public abstract int age();

    public String toString(){
        return "Display : "+display()+"\nQuack : "+quack()+"\nFly : "+fly()+"\nSwim : "+swim()+"\nOrigin : "+origin()+"\nColor : "+color()+"\nAge : "+age();
    }
}
