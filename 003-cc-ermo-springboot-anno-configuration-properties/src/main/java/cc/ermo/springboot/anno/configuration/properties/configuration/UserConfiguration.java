package cc.ermo.springboot.anno.configuration.properties.configuration;

import cc.ermo.springboot.anno.configuration.properties.model.UserBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2022/7/1.
 *
 * @author ermo
 * @since 1.0
 */
@Configuration
@EnableConfigurationProperties({UserProperties.class})
public class UserConfiguration {

    @Bean
    public UserBean getUserBean(UserProperties userProperties) {
        final UserBean userBean = new UserBean();
        userBean.setPassword(userProperties.getPassword());
        userBean.setUsername(userProperties.getUsername());
        return userBean;
    }
}
