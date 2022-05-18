package com.example.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedback, Integer> {

	@Query("select f from Feedback f")
	public List<Feedback> getAllFeedback();
	
}
