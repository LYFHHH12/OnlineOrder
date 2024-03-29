package com.laioffer.onlineorder.hello;


import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping("/hello")
    public Person sayHello() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();


        return new Person(name, company, new Address(street, city, state, null), new Book(bookTitle, bookAuthor));
    }




    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "Hello Goodbye!";
    }
}
