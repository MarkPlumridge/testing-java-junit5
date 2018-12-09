package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    @DisplayName("Test Dependent Assertions")
    void dependentAssertions() {

        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("01207505653");

        assertAll("Marks dependent Assertion FULL Test",
                () -> assertAll("Person Properties Test"),
                    () -> assertEquals("Joe", owner.getFirstName(), "First name did not match"),
                    () -> assertEquals("Buck", owner.getLastName()),

                () -> assertAll("Owner Properties Test",
                    () -> assertEquals("Key West", owner.getCity(), "City did not match!"),
                    () -> assertEquals("01207", owner.getTelephone(), "Telephone did not match"))

                );





    }
}