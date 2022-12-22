import java.util.Random;

public class Student {
    String name;
    int age;

    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge() {
        Random randomAge = new Random();
        int a = randomAge.nextInt(35);
        System.out.println("Student " + name + " is " + age + " years old");
        if (age == a) {
            System.out.println("My guess is " + a + " and the age is correct!");
        } else if (age > a) {
            System.out.println("My guess is " + a + " and the age is higher!");
        } else {
            System.out.println("My guess is " + a + " and the age is lower!");
        }
    }
}
