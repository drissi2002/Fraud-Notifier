package tn.demo.fraud.service;

import org.springframework.stereotype.Service;
import tn.demo.fraud.repository.FraudCheckHistoryRepository;
import tn.demo.fraud.model.FraudCheckHistory;

import java.time.LocalDateTime;

@Service
public record FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {

    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build());
        return false;
    }

}
