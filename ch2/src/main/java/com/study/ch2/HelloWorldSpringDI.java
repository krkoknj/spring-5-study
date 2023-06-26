package com.study.ch2;

import com.study.ch2.decoupled.MessageProvider;
import com.study.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext를 사용하기 전에는
 * MessageRenderer 구현체에 직접 MessageProvider 인스턴스를 제공해야 했다.
 */
public class HelloWorldSpringDI {
    public static void main(String... args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
           ("spring/app-context.xml");

        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        // 스프링이 xml 파일을 해석 해서 자동으로 의존성 주입.
//        mr.setMessageProvider(new MessageProvider() {
//            @Override
//            public String getMessage() {
//                return "Hi";
//            }
//        });
        mr.render();
    }
}
