package org.chit.emailnotificationservice.service.implementation;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;
import org.chit.emailnotificationservice.component.SignupEmailTemplate;
import org.chit.emailnotificationservice.model.Mail;
import org.chit.emailnotificationservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private SignupEmailTemplate signupEmailTemplate;

    @Override
    public String sendEmail(Mail mail) {
        String htmlContent = signupEmailTemplate.getHtmlContent().replace("${user_name}", mail.getUserName());
        try{
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
            helper.setSubject("Account created at Chits");
            helper.setText(htmlContent, true);
            log.info("{}",signupEmailTemplate.getHtmlContent());
            helper.setTo(mail.getToAddress());
//
            mailSender.send(mimeMessage);
        }catch(MessagingException e){
            log.error("Exception caused is"+ e.getCause());
        }
        return "Mail was sent to "+ mail.getUserName() + " successfully";
    }
}
