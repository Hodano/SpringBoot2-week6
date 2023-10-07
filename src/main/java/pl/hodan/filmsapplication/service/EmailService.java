package pl.hodan.filmsapplication.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    final private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String sender;
    @Value("${email.addressee}")
    private String addressee;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(sender);
        message.setTo(addressee);
        message.setSubject("Hello world");
        message.setText("Hello");

        javaMailSender.send(message);
    }
}
