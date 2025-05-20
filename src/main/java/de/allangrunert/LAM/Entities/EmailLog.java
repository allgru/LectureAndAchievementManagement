package de.allangrunert.lam.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "email_log")
@Setter
@Getter
@NoArgsConstructor
public class EmailLog implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;
    private String email;
    private String subject;
    private String body;
    private String status;
    private String errorMessage;
    private String timestamp;
    private String recipient;
    private String sender;
    private String cc;
    private String bcc;
    private String attachments;
    private String priority;
    private String replyTo;
    private String inReplyTo;
    // private String references;
    private String messageId;
    private String contentType;
    private String charset;

    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
