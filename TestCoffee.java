
public class TestCoffee {

    public static void main(String[] args) {
        Coffee blackCoffee =  new BlackCoffee();
        System.out.println(blackCoffee.getDescription() + " Cost: $" + blackCoffee.getCost());

        CoffeeDecorator milkDecorator = new Milk();
        milkDecorator.setCoffee(blackCoffee);
        System.out.println(milkDecorator.getDescription() + " Cost: $" + milkDecorator.getCost());

        CoffeeDecorator caramelDecorator = new CaramelSyrup();
        caramelDecorator.setCoffee(milkDecorator);
        System.out.println(caramelDecorator.getDescription() + " Cost: $" + caramelDecorator.getCost());
    }
}