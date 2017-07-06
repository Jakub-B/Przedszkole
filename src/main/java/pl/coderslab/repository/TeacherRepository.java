package pl.coderslab.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.coderslab.model.Teacher;

@Transactional
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	Teacher findByLogin(String login);
	

	

}
