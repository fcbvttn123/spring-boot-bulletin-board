package ca.sheridancollege.vutran.bootstrap;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.services.PostServiceImplementation;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {
	
	private PostServiceImplementation postServiceImpl;

	@Override
	public void run(String... args) throws Exception {

		Post p1 = new Post("David", "Topic Text", "Content Text", LocalDate.of(2024, 7, 23), LocalTime.of(8, 20, 45));
		
		Post p2 = new Post("Linda", "Topic Text", "Content Text", LocalDate.of(2024, 7, 23), LocalTime.of(8, 20, 35));
		
		Post p3 = new Post("Peter", "Topic Text", "Content Text", LocalDate.of(2024, 7, 21), LocalTime.of(8, 20, 45));

		postServiceImpl.createPost(p1);
		postServiceImpl.createPost(p2);
		postServiceImpl.createPost(p3);
		
	}

}
