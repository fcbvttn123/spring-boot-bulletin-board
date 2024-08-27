package ca.sheridancollege.vutran.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.vutran.domain.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
	public List<Post> findAllByOrderByTimeCreatedDesc();
	public List<Post> findAllByOrderByDateCreatedDesc();
}
