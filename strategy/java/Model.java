public class Model extends Duck {
    public Model()      
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() 
    {
        System.out.println("I'm Model Duck");
    }
}
