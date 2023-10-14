package org.chit.emailnotificationservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.chit.emailnotificationservice.model.Mail;
import org.chit.emailnotificationservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email-notification")
@Slf4j
public class EmailNotificationController {
    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/notify",method = RequestMethod.GET)
    public ResponseEntity<String> sendEmail(@RequestBody Mail mail){
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(emailService.sendEmail(mail));
    }
}
