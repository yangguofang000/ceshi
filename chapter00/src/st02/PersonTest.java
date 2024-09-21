package st02;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.height = 1.75;
        System.out.println(p1.height);
        System.out.println(p1.age);
        p1.birthday = new MyDate();
        p1.birthday.year = 2020;
        p1.birthday.month = 12;
        p1.birthday.day = 10;
        System.out.println(p1.birthday.year);
        System.out.println(p1.birthday.month);
        System.out.println(p1.birthday.day);
        p1.st1();
        p1.st2();
        p1.st3();

    }
}
