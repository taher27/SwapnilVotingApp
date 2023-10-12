// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class Admin_setRoles_4ef6a0a348_Test {

    @InjectMocks
    private Admin admin;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("Admin"));
        roles.add(new Role("User"));

        admin.setRoles(roles);

        List<Role> actualRoles = admin.getRoles();
        assertEquals(roles, actualRoles);
    }

    @Test
    public void testSetRoles_EmptyList() {
        List<Role> roles = new ArrayList<>();

        admin.setRoles(roles);

        List<Role> actualRoles = admin.getRoles();
        assertEquals(roles, actualRoles);
    }
}