package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.model.Children;
import pl.coderslab.model.Parent;

public interface ChildrenRepository extends JpaRepository<Children, Long> {

	

}
