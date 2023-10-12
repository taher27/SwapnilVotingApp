// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Admin_getId_92e05748b6_Test {

    private Admin admin;

    @BeforeEach
    public void setUp() {
        admin = new Admin();
    }

    @Test
    public void testGetIdSuccess() {
        admin.setId(5);
        assertEquals(5, admin.getId(), "Admin id should be 5");
    }

    @Test
    public void testGetIdFailure() {
        admin.setId(10);
        assertEquals(5, admin.getId(), "Admin id should be 5, but it is not");
    }
}