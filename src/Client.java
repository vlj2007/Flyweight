public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("State1");
        flyweight1.operation("ExternalState1");

        Flyweight flyweight2 = factory.getFlyweight("State1");
        flyweight2.operation("ExternalState2");

        Flyweight flyweight3 = factory.getFlyweight("State2");
        flyweight3.operation("ExternalState3");

        // Проверка, что flyweight1 и flyweight2 ссылаются на один и тот же объект
        System.out.println(flyweight1 == flyweight2); // true
    }
}
