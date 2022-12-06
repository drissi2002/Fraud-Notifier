package tn.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.demo.model.FraudCheckHistory;

public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
