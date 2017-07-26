public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() 
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) 
    {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
        this.quackBehavior = qb;
    }

    public abstract void display();
} 
