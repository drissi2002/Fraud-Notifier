package tn.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.demo.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}