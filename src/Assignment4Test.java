/**
 * Created by Kevin on 2/6/2017.
 */

public class Assignment4Test {

    public static void main(String[] args) {

        //For Task 1
        Student s1 = new Student("James", 1234);
        Student s2 = new Student("Amy", 2345);
        Student s3 = new Student("Jack", 0123);
        Course co = new Course("Java");
        co.registerStudent(s1);
        co.registerStudent(s2);
        co.registerStudent(s3);
        co.getStudent();
        for (int i = 0; i < 7; i++) {
            co.registerStudent(s1);
        }
        co.registerStudent(s2);

        //For Task 2
        Book b1 = new Book("Java I", 29.99);
        Book b2 = new Book("Harry Porter", 9.99);
        Book b3 = new Book("Steve Jobs", 34.99);
        Customer c = new Customer("Jone");
        c.buyBooks(b1);
        c.buyBooks(b2);
        c.buyBooks(b3);
        c.getReceipt();
        c.purchased();

        //For Task 345
        Driver d = new Driver("Tom", "BMW");
        d.checkcar();
        d.drive(60);
        d.checkcar();
        d.drive(50);
        d.addGas(40);
        d.addGas(30);

        //For extra credit
        Assignment4EC as = new Assignment4EC();

        int[] a1 = {0, 1, 3};
        int[] a2 = {0, 1, 0, 3, 12};
        int[] a3 = {2, 2, 3, 1};

        as.missingNumber(a1);
        as.moveZeroes(a2);
        System.out.println(as.thirdMax(a3));

    }
}
