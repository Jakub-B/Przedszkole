package pl.coderslab.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.model.Children;
@Transactional
public interface ChildrenRepository extends JpaRepository<Children, Long> {

	

}
