package tn.demo.notification.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.demo.clients.notification.NotificationRequest;
import tn.demo.notification.model.Notification;
import tn.demo.notification.repository.NotificationRepository;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerName())
                        .sender("Drissi-Houcemeddine")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}