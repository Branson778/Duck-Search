package org.jointheleague.level7.duck.presentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
    private HomeController hc;

    @BeforeEach
    void setUp(){hc = new HomeController();}

    @Test
    void whenHome_thenReturnRedirect() {
        //given
        String expected = "redirect:swagger-ui.html";

        //when
        String actual = hc.home();

        //then
        assertEquals(expected, actual);
    }
}
