import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 5");
        int value = 33;
        changeValue(value);
        System.out.println(value);
        System.out.println();

        System.out.println("Task 6");
        Integer val = 33;
        changeValue(val);
        System.out.println(val);
        System.out.println();

        System.out.println("Task 7");
        Integer[] integers = new Integer[]{3, 4};
        changeValue(integers);
        System.out.println(Arrays.toString(integers));
        System.out.println();

        System.out.println("Task 8");
        Integer[] numbers = new Integer[]{3, 4};
        changeValue1(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        System.out.println("Task 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        System.out.println();

        System.out.println("Task 10");
        person = new Person("Lyapis", "Trubetskoy");
        changePerson1(person);
        System.out.println(person);
    }

    static void changeValue(int value) {
        value = 22;
    }

    static void changeValue(Integer value) {
        value = 22;
    }

    static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    static void changeValue1(Integer[] value) {
        value[0] = 99;
    }

    static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    static void changePerson1(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}
