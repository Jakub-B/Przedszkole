package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.coderslab.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	

	@Query("select u from User u")
	List<User> findUsersQuery();
	
	
	
//	Tweetów o tytule, który zaczyna się od ciągu znaków Programo ,
//	posortowane od najnowszego względem daty utworzenia.
//	
	
}
