package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.model.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {

	Parent findByLogin(String login);
	
//	@Query("SELECT c FROM Children c, Parent p, Children_Parent cp WHERE p.id = ?1 AND cp.parents_id = p.id AND cp.Children_id = c.id")
//	List<Children> findParentsChildrenByParentId(long id);
}
