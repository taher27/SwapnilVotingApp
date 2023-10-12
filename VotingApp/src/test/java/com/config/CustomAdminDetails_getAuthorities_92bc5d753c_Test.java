// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.model.Admin;
import com.model.Role;

public class CustomAdminDetails_getAuthorities_92bc5d753c_Test {
    
    @Autowired
    private Admin adm;

    @Test
    public void testGetAuthorities() {
        // Mocking Roles
        Role role1 = new Role();
        role1.setName("ROLE_USER");

        Role role2 = new Role();
        role2.setName("ROLE_ADMIN");

        List<Role> roles = new ArrayList<>();
        roles.add(role1);
        roles.add(role2);

        // Mocking Admin
        Mockito.when(adm.getRoles()).thenReturn(roles);

        // Expected Authorities
        List<GrantedAuthority> expectedAuthorities = new ArrayList<>();
        expectedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        expectedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        // Asserting
        assertEquals(expectedAuthorities, adm.getAuthorities());
    }

    @Test
    public void testGetAuthorities_EmptyRoles() {
        // Mocking empty roles
        List<Role> roles = new ArrayList<>();
        Mockito.when(adm.getRoles()).thenReturn(roles);

        // Expected Authorities
        List<GrantedAuthority> expectedAuthorities = new ArrayList<>();

        // Asserting
        assertEquals(expectedAuthorities, adm.getAuthorities());
    }
}
