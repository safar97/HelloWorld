package get.helloworld;
import org.springframework.boot.SpringApplication;

public class SpringBootApplicationLuncher {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
}