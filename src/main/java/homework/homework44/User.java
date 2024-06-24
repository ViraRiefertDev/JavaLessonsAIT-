package homework.homework44;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String password;
    private String role;

    public User(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return  "userName='" + userName +
                ", password='" + password +
                ", role='" + role;
    }
}
