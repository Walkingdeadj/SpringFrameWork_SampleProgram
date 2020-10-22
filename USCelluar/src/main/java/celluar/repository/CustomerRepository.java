package celluar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import celluar.beans.CustomerContact;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerContact, Long> {

}
