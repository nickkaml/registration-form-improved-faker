package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;


public class RegistrationWithPageObjectsTests extends TestBase {

    @Test
    void successfulRegistrationTest() {

        Faker faker = new Faker();

        String firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                email = faker.internet().emailAddress(),
                gender = "Male",
                phoneNumber = faker.phoneNumber().subscriberNumber(10),
                yearOfBirth = "1999",
                monthOfBirth = "January",
                dayOfBirth = "01",
                subjects = "Math",
                hobbies = "Sports",
                picture = "picture.jpeg",
                address = faker.address().fullAddress(),
                state = "Rajasthan",
                city = "Jaiselmer";


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(phoneNumber)
                .setDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .uploadPicture(picture)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .submit()
                .verifyResultsModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phoneNumber)
                .verifyResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .verifyResult("Subjects", subjects)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", picture)
                .verifyResult("Address", address)
                .verifyResult("State and City", state + " " + city);

    }
}
