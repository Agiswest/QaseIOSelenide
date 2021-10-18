package models;

import com.github.javafaker.Faker;

public class CaseFactory {

    public static Case get() {
        Faker faker = new Faker();
        return new Case(faker.name().title(), "Draft",
                "Critical", "High",
                "Usability", "Unit",
                "Yes", "Positive",
                "Automated");
    }
}
