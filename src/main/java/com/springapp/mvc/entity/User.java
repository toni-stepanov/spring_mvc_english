package com.springapp.mvc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "app_user")
public class User {


    @Id
    @GeneratedValue
	private Integer id;

	private String mail;

	private String password;

    private boolean enabled;

	@ManyToMany
	@JoinTable
	private List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
