package cn.dayutianfei.egret;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext(
                "classpath:applicationContext.xml");
        App hello = (App) ctx.getBean("app");
        System.out.println(hello.getName());
        hello.sayHello();
    }
}
