package cc.ermo.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world
 * <p>
 * remark: @RestController = @Controller + @ResponseBody
 *
 * @author ermo
 */
@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

    /**
     * main method.
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    /**
     * http://localhost:8080/hello?name=springboot
     *
     * @param name name
     * @return result
     */
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }

}
