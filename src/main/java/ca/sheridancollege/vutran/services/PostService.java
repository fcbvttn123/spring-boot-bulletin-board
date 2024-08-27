package ca.sheridancollege.vutran.services;

import java.util.List;

import ca.sheridancollege.vutran.domain.Post;

public interface PostService {
	public List<Post> getPostsInChronologicalOrder();
	public Post createPost(Post post);
}
