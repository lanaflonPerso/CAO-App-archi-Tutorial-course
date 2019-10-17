package cao.application.architecture.unicornrenting.repository;

import cao.application.architecture.unicornrenting.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Customer, Long> {

}