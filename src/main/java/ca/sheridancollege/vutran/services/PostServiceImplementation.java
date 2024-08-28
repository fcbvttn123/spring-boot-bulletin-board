package ca.sheridancollege.vutran.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.repositories.PostRepo;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
@AllArgsConstructor
public class PostServiceImplementation implements PostService {
	
	private PostRepo postRepo;

	@Override
	public List<Post> getPostsInChronologicalOrder() {
		return postRepo.findAllByOrderByDateCreatedDesc();
	}

	@Override
	public Post createPost(Post post) {  
		post.setDateCreated(LocalDate.now());	
		post.setTimeCreated(LocalTime.now());	
		return postRepo.save(post);
	}

}
