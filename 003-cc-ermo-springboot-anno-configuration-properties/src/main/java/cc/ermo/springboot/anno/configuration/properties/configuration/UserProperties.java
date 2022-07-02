package cc.ermo.springboot.anno.configuration.properties.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * IDE tips: Spring Boot Configuration Annotation Processor not configured.
 * After add dependency spring-boot-configuration-processor and re-compile your project, the tips will disappear.
 * This dependency generate metadata for IDE(Eclipse, IntelliJ).
 * <p>
 * Spring Boot Official Website docs:
 * https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor
 * <p>
 * Created by admin on 2022/7/1.
 *
 * @author ermo
 * @since 1.0
 */
@ConfigurationProperties(prefix = "user")
public class UserProperties {

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
