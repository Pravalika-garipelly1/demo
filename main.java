public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printMessage();

        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(5, 3));
        System.out.println("Difference: " + calculator.subtract(5, 3));

        Person person = new Person("Alice", 25);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
    }
}
