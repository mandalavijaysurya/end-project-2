package org.chit.emailnotificationservice.component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
@Getter
public class SignupEmailTemplate {
    private final String htmlContent;

    public SignupEmailTemplate(){
        try{
            // creating bean for html page
            Resource resource = new ClassPathResource("templates/signup-email.html");
            byte[] htmlBytes = FileCopyUtils.copyToByteArray(resource.getInputStream());
             htmlContent = new String(htmlBytes, StandardCharsets.UTF_8);
        }catch(IOException exception){
            throw new RuntimeException("Exception occurred was " +exception.toString());
        }
    }

}
