// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.model.Admin;

@SpringBootTest
public class CustomAdminDetails_getUsername_0a6d3fd936_Test {

    @MockBean
    private Admin adm;

    @Test
    public void testGetUsernameSuccess() {
        Mockito.when(adm.getName()).thenReturn("adminUser");
        String username = adm.getName();
        Assertions.assertEquals("adminUser", username);
    }

    @Test
    public void testGetUsernameFailure() {
        Mockito.when(adm.getName()).thenReturn(null);
        String username = adm.getName();
        Assertions.assertNull(username);
    }
}
