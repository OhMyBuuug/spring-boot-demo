package spring.boot.demo.controller;


import spring.boot.demo.bo.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <br> Project: spring-boot-demo
 * <br> Package: cn.yk.demo.controller
 * <br> Description:
 * <br> Date: Created in 14:45 2017/2/15.
 * <br> Modified By
 *
 * @author SiGen
 */
@RestController

@RequestMapping("/demo")
public class DemoController {
    // 返回一个JSON对象
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("name");

        return demo;
    }
    // 测试异常处理
    @RequestMapping("/zeroException")
    public int zereException(){
        return 100/0;
    }
}
