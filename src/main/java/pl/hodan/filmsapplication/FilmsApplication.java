package pl.hodan.filmsapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FilmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmsApplication.class, args);
    }
   

}
