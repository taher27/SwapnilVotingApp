// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class User_User_58418fc4be_Test {

    private User user;
    private Role role1, role2;

    @BeforeEach
    public void setUp() {
        role1 = new Role(1, "Admin");
        role2 = new Role(2, "User");
        List<Role> roles = new ArrayList<>();
        roles.add(role1);
        roles.add(role2);
        user = new User(1, "John", "password123", "john@example.com", 1234567890, roles);
    }

    @Test
    public void testUserConstructor() {
        assertEquals(1, user.getId());
        assertEquals("John", user.getName());
        assertEquals("password123", user.getPassword());
        assertEquals("john@example.com", user.getEmail());
        assertEquals(1234567890, user.getPhone());
        assertEquals(2, user.getRoles().size());
        assertEquals("Admin", user.getRoles().get(0).getRoleName());
        assertEquals("User", user.getRoles().get(1).getRoleName());
    }

    @Test
    public void testUserConstructorWithEmptyRole() {
        user = new User(2, "Jane", "password456", "jane@example.com", 9876543210, new ArrayList<>());
        assertEquals(2, user.getId());
        assertEquals("Jane", user.getName());
        assertEquals("password456", user.getPassword());
        assertEquals("jane@example.com", user.getEmail());
        assertEquals(9876543210, user.getPhone());
        assertEquals(0, user.getRoles().size());
    }
}