package cc.ermo.springboot.anno.configuration.properties;

import cc.ermo.springboot.anno.configuration.properties.configuration.UserProperties;
import cc.ermo.springboot.anno.configuration.properties.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * learn annotation @ConfigurationProperties
 *
 * @author ermo
 */
@SpringBootApplication
@RestController
public class SpringBootAnnoConfigurationPropertiesApplication {

    @Autowired
    private UserBean userBean;

    @Autowired
    private UserProperties userProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAnnoConfigurationPropertiesApplication.class, args);
    }

    /**
     * http://localhost:8080/user/get
     *
     * @return userBean
     */
    @GetMapping("/user/get")
    public UserBean getUser() {
        return this.userBean;
    }

    /**
     * http://localhost:8080/user/properties/get
     *
     * @return userProperties
     */
    @GetMapping("/user/properties/get")
    public UserProperties getUserProperties() {
        return this.userProperties;
    }

}
