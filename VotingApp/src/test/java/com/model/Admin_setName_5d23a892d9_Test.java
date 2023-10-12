// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Admin_setName_5d23a892d9_Test {

    private Admin admin;

    @BeforeEach
    public void setup() {
        admin = new Admin();
    }

    @Test
    public void testSetName_withValidName() {
        String name = "John Doe";
        admin.setName(name);
        assertEquals(name, admin.getName());
    }

    @Test
    public void testSetName_withNull() {
        String name = null;
        admin.setName(name);
        assertEquals(name, admin.getName());
    }
}