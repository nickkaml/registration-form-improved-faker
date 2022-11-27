package tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestData {

    Faker faker = new Faker();
    SimpleDateFormat year = new SimpleDateFormat("yyyy"),
            month = new SimpleDateFormat("MMMM", Locale.ENGLISH),
            day = new SimpleDateFormat("dd");


    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Male",
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            yearOfBirth = year.format(faker.date().birthday()),
            monthOfBirth = month.format(faker.date().birthday()),
            dayOfBirth = day.format(faker.date().birthday()),
            subjects = "Math",
            hobbies = "Sports",
            picture = "picture.jpeg",
            address = faker.address().fullAddress(),
            state = "Rajasthan",
            city = "Jaiselmer";

}
