package ricoom.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ricoom.transport.dao.Passanger;

public interface PassangerRepo extends JpaRepository<Passanger,String> {

}
