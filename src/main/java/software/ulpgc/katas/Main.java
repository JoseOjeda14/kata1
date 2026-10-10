package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person jose = new Person("Jose", LocalDate.of(2005, 05, 14));

        System.out.println("La edad de " + jose.name() + " es de " + jose.age());

    }
}
