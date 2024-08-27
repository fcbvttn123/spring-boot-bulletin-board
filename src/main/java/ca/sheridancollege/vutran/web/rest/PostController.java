package ca.sheridancollege.vutran.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.services.PostServiceImplementation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/posts")
@AllArgsConstructor
public class PostController {
	private PostServiceImplementation postServiceImpl;
	@GetMapping
	public List<Post> getPostsInChronologicalOrder() {
		return postServiceImpl.getPostsInChronologicalOrder();
	}
	@PostMapping
	public Post createPost(@RequestBody Post post) {
		return postServiceImpl.createPost(post);
	}
}
