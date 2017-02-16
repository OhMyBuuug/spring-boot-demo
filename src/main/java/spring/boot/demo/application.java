package spring.boot.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * <br> Project: spring-boot-demo
 * <br> Package: cn.yk.demo
 * <br> Description:
 * <br> Date: Created in 14:34 2017/2/15.
 * <br> Modified By
 *
 * @author SiGen
 */
// 必须位于src/main/java的子目录下(如src/main/java/demo),且层级高于业务代码
@SpringBootApplication
public class application extends WebMvcConfigurerAdapter{

    /**
     * 配置fastjson
     * 第一种方法 :  启动类(application.class)继承WebMvcConfigurerAdapter,
     *              覆盖方法configureMessageConverters
     * 第二种方法 :  在启动类中注入Bean:HttpMessageConverters
     *
     *              @Bean
     *              public HttpMessageConverters DemoMessageConverters(){
     *                  return new HttpMessageConverters(new FastJsonHttpMessageConverter());
     *              }
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converter.setFeatures(SerializerFeature.PrettyFormat);
        converters.add(converter);
        super.configureMessageConverters(converters);
    }


    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
