package ca.sheridancollege.vutran.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.repositories.PostRepo;
import lombok.AllArgsConstructor;

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
		return postRepo.save(post);
	}

}
