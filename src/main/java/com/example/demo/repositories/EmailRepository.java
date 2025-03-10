package com.example.demo.repositories;

import com.example.demo.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel,Long> {
}
