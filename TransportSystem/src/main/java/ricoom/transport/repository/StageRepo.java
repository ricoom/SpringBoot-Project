package ricoom.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ricoom.transport.dao.Stage;

public interface StageRepo extends JpaRepository<Stage,Long> {

}
