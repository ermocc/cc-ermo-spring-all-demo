package cc.ermo.springboot.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ermo
 */
@SpringBootApplication
@RestController
public class SpringBootDevToolsApplication {

    /**
     * main method
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDevToolsApplication.class, args);
    }

    /**
     * After start server, edit return string and click the Build Project button,
     * the code is effective.
     *
     * @param name name
     * @return result
     */
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello hot " + name;
    }

}
