package inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Inventory microservice is ready for business...");

        // Subscribe to Message Hub topics
        MHConsumer mh = (MHConsumer) ctx.getBean("MHConsumer");
        mh.subscribe();
    }
}
