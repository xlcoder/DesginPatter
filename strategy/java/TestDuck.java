public class TestDuck {
    public static void main(String[] args) {
        Model model = new Model();

        model.performFly();
        model.setFlyBehavior(new FlyWithRocket());
        model.performFly();
        model.performQuack();
        model.display();
    }
} 
