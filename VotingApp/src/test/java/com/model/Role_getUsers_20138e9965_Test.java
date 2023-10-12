// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.model;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class Role_getUsers_20138e9965_Test {

    @InjectMocks
    Role role;

    @Mock
    List<User> mockUsers;

    @BeforeEach
    public void setUp() {
        when(mockUsers.get(0)).thenReturn(new User());
        when(mockUsers.get(1)).thenReturn(new User());
        role.setUsers(mockUsers);
    }

    @Test
    public void testGetUsers_Success() {
        List<User> actualUsers = role.getUsers();
        assertEquals(mockUsers, actualUsers);
    }

    @Test
    public void testGetUsers_Failure() {
        List<User> differentUsers = Arrays.asList(new User(), new User());
        List<User> actualUsers = role.getUsers();
        assertEquals(false, differentUsers.equals(actualUsers));
    }
}
