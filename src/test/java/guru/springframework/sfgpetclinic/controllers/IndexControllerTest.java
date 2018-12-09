package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned!");

        assertEquals("index", controller.index(), () -> "Lambda version of Wrong View Returned!");

    }

    @Test
    @DisplayName("Test Exception")
    void oupsHandler() {

       assertThrows(ValueNotFoundException.class, () -> controller.oupsHandler());

    }
}