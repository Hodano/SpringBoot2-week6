package pl.hodan.filmsapplication.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    final private FilmsService filmsService;
    final private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String sender;
    @Value("${email.recipient}")
    private String recipient;

    public EmailService(FilmsService filmsService, JavaMailSender javaMailSender) {
        this.filmsService = filmsService;
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(sender);
        message.setTo(recipient);
        message.setSubject("Co tam");
        message.setText(filmsService.getLastFilm().toString());

        javaMailSender.send(message);
    }
}
