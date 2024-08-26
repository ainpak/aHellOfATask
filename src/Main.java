public class Main {
    public static void main(String[] args) {

        System.out.println("Тестирование класса Car:");
        Car car = new Car("Toyota", "Camry", 2020, "Blue");
        car.displayInfo();
        car.setColor("Red");
        System.out.println("Updated color: " + car.getColor());
        System.out.println();


        System.out.println("Тестирование класса BankAccount:");
        BankAccount account = new BankAccount("123456", 1000.0, "John Doe");
        account.printAccountInfo();
        account.deposit(500.0);
        System.out.println("After deposit:");
        account.printAccountInfo();
        account.withdraw(200.0);
        System.out.println("After withdrawal:");
        account.printAccountInfo();
        account.withdraw(1500.0); // Попытка снятия слишком большой суммы
        System.out.println();


        System.out.println("Тестирование класса Circle:");
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        circle.setRadius(10.0);
        System.out.println("Updated radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Circumference: " + circle.calculateCircumference());
        System.out.println();


        System.out.println("Тестирование класса Employee:");
        Employee employee = new Employee("Alice", "Manager", 50000.0);
        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Salary: " + employee.getSalary());
        employee.raiseSalary(10.0);
        System.out.println("After raise:");
        System.out.println("Salary: " + employee.getSalary());
        System.out.println();

        // Тестирование класса Product
        System.out.println("Тестирование класса Product:");
        Product product = new Product("Laptop", 1200.0, 50);
        System.out.println("Product name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        product.increaseQuantity(20);
        System.out.println("After increasing quantity:");
        System.out.println("Quantity: " + product.getQuantity());
        product.decreaseQuantity(10);
        System.out.println("After decreasing quantity:");
        System.out.println("Quantity: " + product.getQuantity());
        product.decreaseQuantity(100); // Попытка уменьшения количества больше доступного
    }
}