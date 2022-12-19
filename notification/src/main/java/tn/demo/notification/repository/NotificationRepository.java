package tn.demo.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.demo.notification.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}