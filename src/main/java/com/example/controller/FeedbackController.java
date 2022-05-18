package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Feedback;
import com.example.services.FeedbackService;


@RestController
public class FeedbackController {

	@Autowired
	private FeedbackService  feedbackService;
	
	
	
	//to add feedback of user 	
	@PostMapping("/addFeedback")
	public Feedback addFeedback(@RequestBody Feedback feedback)
	{
		return this.feedbackService.addFeedback(feedback);
	}
	
	
	
	//to fetch feedback of user on the basis of rollNo
	@GetMapping("/getFeedback/{id}")
	public Feedback getFeedback(@PathVariable("id") int id)
	{
		return this.feedbackService.getFeedback(id);
		
	}
	
	
	
	@GetMapping("/getFeedback")
	public List<Feedback> getFeedback()
	{
		return this.feedbackService.getFeedback();		
		
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteFeedback(@PathVariable("id") int id)
	{
		this.feedbackService.delete(id);
	}
	
	
	@PutMapping("/update/{id}")
	public Feedback updateFeedback(@RequestBody Feedback feedback,@PathVariable("id") int id)
	{
		return this.feedbackService.update(feedback,id);
	}
	
	
}
