package io.nilmani.mailservice.repository;

import io.nilmani.mailservice.entity.EmailEntity;
import io.nilmani.mailservice.entity.MailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository  extends JpaRepository<EmailEntity, Long> {
}
