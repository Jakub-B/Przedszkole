package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.coderslab.model.Tweet;
import pl.coderslab.model.User;


public interface TweetRepository extends JpaRepository<Tweet, Long> {

	

	@Query("select t from Tweet t")
	List<User> findTweetsQuery();
	
////	Tweetów dla zadanego id użytkownika
//	
//	List<Tweet> findByUser(User user);
//	
////	Tweetów o tytule, który zaczyna się od ciągu znaków Programo , 
////	posortowane od najnowszego względem daty utworzenia.	
//	String title = "programmo%";
//	List<Tweet> findByTitleLikeOrderByDateDesc(String title);
//

	
	
}
