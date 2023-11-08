package io.nilmani.mailservice.controller;

import io.nilmani.mailservice.entity.EmailEntity;
import io.nilmani.mailservice.entity.MailEntity;
import io.nilmani.mailservice.service.EmailMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nilmani/v1/api")
public class EmailMessageController {
//    private final EmailMessageService emailMSGService;
//
//    @Autowired
//    public EmailMessageController(EmailMessageService emailMSGService) {
//        this.emailMSGService = emailMSGService;
//    }
//
//    @PostMapping("/save-email-message")
//    public String saveEmailMessage(
//            @RequestParam String email,
//            @RequestParam String message) {
//        MailEntity emailMessage = new MailEntity();
//        emailMessage.setEmail(email);
//        emailMessage.setMessage(message);
//
//        emailMSGService.saveEmail(emailMessage);
//
//        return "Email message saved successfully!";
//    }
    @Autowired
    private EmailMessageService emailMSGService;

    @PostMapping("/save-email")
    public ResponseEntity<String> sendEmail(@ModelAttribute EmailEntity mailEntity){
        emailMSGService.SendCustomEmail(mailEntity);
        return ResponseEntity.ok("Email send success ,and mail saved");

    }
}
