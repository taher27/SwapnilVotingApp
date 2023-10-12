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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CustomAdminDetails_isCredentialsNonExpired_8b4fc66884_Test {

    private CustomAdminDetails customAdminDetails;

    @BeforeEach
    public void setUp() {
        customAdminDetails = new CustomAdminDetails(new Admin());
    }

    @Test
    public void testIsCredentialsNonExpired() {
        assertTrue(customAdminDetails.isCredentialsNonExpired());
    }

    @Test
    public void testIsCredentialsExpired() {
        // TODO: Change the code in a way that credentials are expired
        assertFalse(customAdminDetails.isCredentialsNonExpired());
    }
}
