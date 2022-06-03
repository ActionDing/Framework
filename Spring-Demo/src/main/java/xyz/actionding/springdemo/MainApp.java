package xyz.actionding.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Actionding
 * @create 2022-06-03 15:24
 */
public class MainApp {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext 类用于加载 Spring 配置文件、创建和初始化所有对象（Bean）
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");
        // 获取 Bean
        HelloWorld bean = context.getBean("helloWorld", HelloWorld.class);
        bean.getMsg();
    }
}
