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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
public class User_setRoles_4ef6a0a348_Test {

    @Mock
    private Role role;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testSetRoles() {
        // Prepare test data
        List<Role> roles = new ArrayList<>();
        roles.add(role);

        // Call the method to test
        user.setRoles(roles);

        // Verify the result
        assertNotNull(user.getRoles());
        assertEquals(roles, user.getRoles());
    }

    @Test
    public void testSetRolesWithNull() {
        // Prepare test data
        List<Role> roles = null;

        // Call the method to test
        user.setRoles(roles);

        // Verify the result
        assertEquals(null, user.getRoles());
    }
}
