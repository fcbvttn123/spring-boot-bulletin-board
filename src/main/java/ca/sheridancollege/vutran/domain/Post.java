package ca.sheridancollege.vutran.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String creator;
	private String topic; 
	private String content; 
	private LocalDate dateCreated; 
	private LocalTime timeCreated;
	public Post(String creator, String topic, String content, LocalDate dateCreated, LocalTime timeCreated) {
		this.creator = creator;
		this.topic = topic; 
		this.content = content; 
		this.dateCreated = dateCreated;
		this.timeCreated = timeCreated; 
	}
}
