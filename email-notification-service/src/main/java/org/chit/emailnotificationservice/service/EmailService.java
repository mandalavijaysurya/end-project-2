package org.chit.emailnotificationservice.service;

import org.chit.emailnotificationservice.model.Mail;

public interface EmailService {

    String sendEmail(Mail mail);
}
