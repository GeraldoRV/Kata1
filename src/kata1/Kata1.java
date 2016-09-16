package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Geraldo", new Date(96,9,15));
        System.out.println(person.getAge());
    }
}
