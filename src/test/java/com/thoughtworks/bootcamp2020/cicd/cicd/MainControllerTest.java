package com.thoughtworks.bootcamp2020.cicd.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MainControllerTest {

    @Autowired
    MainController mainController;

    @Test
    public void testIndex(){
        assertEquals("Hello World!",mainController.index());
    }

}
