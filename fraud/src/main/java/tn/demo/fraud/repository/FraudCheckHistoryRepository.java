package tn.demo.fraud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.demo.fraud.model.FraudCheckHistory;

public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
