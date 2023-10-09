package pl.hodan.filmsapplication.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;
import pl.hodan.filmsapplication.service.EmailService;

@Component
@Aspect
public class SendEmailAspect {
    final private EmailService emailService;

    public SendEmailAspect(EmailService emailService) {
        this.emailService = emailService;
    }


    @After("@annotation(pl.hodan.filmsapplication.aop.EmailAspect)")
    public void sendEmailAfterPost() {
        emailService.sendEmail();
    }
}