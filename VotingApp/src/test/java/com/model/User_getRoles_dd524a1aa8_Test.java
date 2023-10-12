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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

@Entity
@Table(name = "user")
public class User {
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }
}

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}

public class User_getRoles_dd524a1aa8_Test {
    @InjectMocks
    private User user;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRoles_Success() {
        List<Role> roles = new ArrayList<>();
        Role role1 = new Role();
        role1.setName("Admin");
        roles.add(role1);
        Role role2 = new Role();
        role2.setName("User");
        roles.add(role2);

        user.setRoles(roles);
        List<Role> returnedRoles = user.getRoles();

        Assert.assertEquals(roles, returnedRoles);
    }

    @Test
    public void testGetRoles_Empty() {
        user.setRoles(new ArrayList<>());
        List<Role> returnedRoles = user.getRoles();

        Assert.assertTrue(returnedRoles.isEmpty());
    }
}
