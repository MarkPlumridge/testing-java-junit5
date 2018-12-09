package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void groupedAssertion() {

        Person person = new Person(1L, "Joe", "Buck" );

        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(), "Buck"));

    }

    @Test
    void groupedAssertionErrorMsgs() {

        Person person = new Person(1L, "Joe", "Buck" );

        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joex", "First Name Failed"),
                () -> assertEquals(person.getLastName(), "Buckx", "Last Name Failed"));

    }

}