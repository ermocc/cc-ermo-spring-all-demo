package cc.ermo.springboot.anno.configuration.properties.model;

import java.io.Serializable;

/**
 * Created by admin on 2022/7/1.
 *
 * @author ermo
 * @since 1.0
 */
public class UserBean implements Serializable {

    private String username;

    private String password;

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
}
