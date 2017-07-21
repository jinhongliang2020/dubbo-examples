import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by hong on 2017/7/21.
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        context.start();

        System.out.println("dubbo provider start...");

        try {
            // 按任意键退出
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
