package spring.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br> Project: spring-boot-demo
 * <br> Package: cn.yk.demo.controller
 * <br> Description:
 * <br> Date: Created in 14:35 2017/2/15.
 * <br> Modified By
 *
 * @author SiGen
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello,my man!";
    }
}
