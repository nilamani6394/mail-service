package io.nilmani.mailservice.service;


import io.nilmani.mailservice.entity.EmailEntity;
import io.nilmani.mailservice.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailMessageService {
//    private final EmailRepository emailRepo;
//
//    @Autowired
//    public EmailMessageService(EmailRepository emailRepo) {
//        this.emailRepo = emailRepo;
//    }
//    public MailEntity saveEmail(MailEntity mailEntity){
//        return  emailRepo.save(mailEntity);
//    }
   @Autowired
    private EmailRepository emailRepo;
   @Autowired
   private JavaMailSender mailSender;
   public  void SendCustomEmail(EmailEntity mailEntity){
       mailSender.send(mimeMessage -> {
           MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
           messageHelper.setTo(mailEntity.getRecipient());
           messageHelper.setSubject(mailEntity.getSubject());
           messageHelper.setText(mailEntity.getMessage(),true);

       });
       emailRepo.save(mailEntity);
    }
}
