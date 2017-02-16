package spring.boot.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * <br> Project: spring-boot-demo
 * <br> Package: spring.boot.demo.config
 * <br> Description:
 * <br> Date: Created in 16:56 2017/2/15.
 * <br> Modified By
 *
 * @author SiGen
 */

/**
 *  把该注解内部使用@ExceptionHandler,@InitBinder,@ModelAttribute注解的方法
 *  应用到所有的@RequestMapping注解的方法
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest httpServletRequest,Exception excption){

        /**
         *   If the exception is annotated with @ResponseStatus rethrow it and let
         *   the framework handle it - like the OrderNotFoundException example
         *   at the start of this post.
         *   AnnotationUtils is a Spring Framework utility class.
         *
         *
         */


        /**
         *  if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
         *  throw e;
         */

         /**
          *  Otherwise setup and send the user to a default error-view.
          *  ModelAndView mav = new ModelAndView();
          */

         /**
          *  mav.addObject("exception", e);
          *  mav.addObject("url", req.getRequestURL());
          *  mav.setViewName(DEFAULT_ERROR_VIEW);
          *  return mav;
          */

         //打印异常信息：
         excption.printStackTrace();
         System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");

       /**
        * 返回json数据或者String数据：
        * 那么需要在方法上加上注解：@ResponseBody
        * 添加return即可。
        */

       /**
        * 返回视图：
        * 定义一个ModelAndView即可，
        * 然后return;
        * 定义视图文件(比如：error.html,error.ftl,error.jsp);
        */
    }
}
