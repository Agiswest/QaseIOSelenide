package models;

import com.github.javafaker.Faker;

public class SuiteFactory {
    static Faker faker;

    public static Suite get() {
        faker = new Faker();
        return Suite.builder()
                .title(faker.name().username())
                .description(faker.backToTheFuture().quote())
                .preconditions(faker.beer().name())
                .build();
    }
}
