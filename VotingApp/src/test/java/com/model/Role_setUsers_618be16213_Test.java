// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class Role_setUsers_618be16213_Test {

    @Test
    public void testSetUsers() {
        // Prepare test data
        User user1 = new User();
        user1.setId(1);
        user1.setName("John");

        User user2 = new User();
        user2.setId(2);
        user2.setName("Doe");

        List<User> testUsers = Arrays.asList(user1, user2);

        // Create a Role instance
        Role role = new Role();
        
        // Test setUsers method
        role.setUsers(testUsers);

        // Assert the result
        assertEquals(testUsers, role.getUsers());
    }

    @Test
    public void testSetUsers_Null() {
        // Create a Role instance
        Role role = new Role();
        
        // Test setUsers method with null
        role.setUsers(null);

        // Assert the result
        assertEquals(null, role.getUsers());
    }
}