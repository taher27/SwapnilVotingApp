// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.model.Admin;
import com.model.Role;
import com.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomAdminDetails_CustomAdminDetails_6bc92bc701_Test {

    private CustomAdminDetails testInstance;
    private Admin mockAdmin;

    @BeforeEach
    public void setUp() {
        mockAdmin = new Admin();
        mockAdmin.setName("Test Admin");
        mockAdmin.setPassword("testPassword");
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("ROLE_ADMIN"));
        mockAdmin.setRoles(roles);
    }

    @Test
    public void testCustomAdminDetails_WithValidAdmin() {
        testInstance = new CustomAdminDetails(mockAdmin);
        assertEquals(mockAdmin.getName(), testInstance.getUsername());
        assertEquals(mockAdmin.getPassword(), testInstance.getPassword());
        assertTrue(testInstance.getAuthorities().stream().anyMatch(auth -> auth.getAuthority().equals("ROLE_ADMIN")));
    }

    @Test
    public void testCustomAdminDetails_WithNullAdmin() {
        assertThrows(NullPointerException.class, () -> new CustomAdminDetails(null));
    }
}
