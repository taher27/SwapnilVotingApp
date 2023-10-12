// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class Role_setAdmins_eed484d193_Test {

    @InjectMocks
    private Role role;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSetAdmins() {
        Admin admin1 = new Admin();
        admin1.setId(1);
        admin1.setName("Admin1");

        Admin admin2 = new Admin();
        admin2.setId(2);
        admin2.setName("Admin2");

        List<Admin> admins = Arrays.asList(admin1, admin2);
        role.setAdmins(admins);

        Assertions.assertEquals(admins, role.getAdmins());
    }

    @Test
    public void testSetAdminsEmptyList() {
        List<Admin> admins = Arrays.asList();
        role.setAdmins(admins);

        Assertions.assertEquals(admins, role.getAdmins());
    }

    @Test
    public void testSetAdminsNull() {
        role.setAdmins(null);

        Assertions.assertNull(role.getAdmins());
    }
}
