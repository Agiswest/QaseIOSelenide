package models;

import com.github.javafaker.Faker;

public class ProjectFactory {
    static Faker faker;

    public static Project get() {
        faker = new Faker();
        return new Project(faker.name().title(), "",
                faker.backToTheFuture().quote(), "Public");
    }
}
