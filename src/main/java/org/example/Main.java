package org.example;


public class Main {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.setFirstName("Luigi");
        builder.setLastName("Doro");
        builder.setAge(30);
        builder.setAddress("Via Roma 34");
        Person persona = builder.build();

        Person persona1 = new Person("Giovanni", "Rossi", 30, "Via Donizzetti 13");

        System.out.println(persona);
        System.out.println(persona1);

    }

}