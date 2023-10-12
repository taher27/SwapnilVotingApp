// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class User_User_b7b6575d02_Test {

    @Test
    public void testUserConstructorSuccess() {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("ROLE_ADMIN"));
        User user = new User("test", "password", "test@mail.com", 1234567890, roles);
        
        Assertions.assertEquals("test", user.getName());
        Assertions.assertEquals("password", user.getPassword());
        Assertions.assertEquals("test@mail.com", user.getEmail());
        Assertions.assertEquals(1234567890, user.getPhone());
        Assertions.assertEquals(roles, user.getRoles());
    }

    @Test
    public void testUserConstructorFailure() {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("ROLE_ADMIN"));
        User user = new User("test", "password", "test@mail.com", 1234567890, roles);
        
        Assertions.assertNotEquals("wrong", user.getName());
        Assertions.assertNotEquals("wrongPassword", user.getPassword());
        Assertions.assertNotEquals("wrong@mail.com", user.getEmail());
        Assertions.assertNotEquals(987654321, user.getPhone());
        Assertions.assertNotEquals(new ArrayList<>(), user.getRoles());
    }
}