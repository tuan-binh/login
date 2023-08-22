package ra.academy.model;

import lombok.*;

@Builder
public class User {
    private Long id;
    private String username;
    private String password;
    private  String fullName;
    private String avatar;
    private Long roleId = 2L;

    public User() {
    }

    public User(Long id, String username, String password, String fullName, String avatar, Long roleId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.avatar = avatar;
        this.roleId = roleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
