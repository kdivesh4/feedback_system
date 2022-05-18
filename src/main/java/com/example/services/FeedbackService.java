package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.repository.FeedbackRepo;

@Service
public class FeedbackService {	
	
	@Autowired
	private FeedbackRepo feedbackRepo;
	
	
	//pass the feedback object received from controller -> feedbackRepository 
	public Feedback addFeedback(Feedback feedback)
	{
		return this.feedbackRepo.save(feedback);
	}
	
	
	public Feedback getFeedback(int id)
	{
		Feedback feedback=null;

		/*
		Iterable<Feedback> findAll = this.feedbackRepo.findAll();
		Iterator<Feedback> feedbackList = findAll.iterator();
		while(feedbackList.hasNext())
		{
			feedback = feedbackList.next();
			//return feedback;
		}
		*/
		
		
		Optional<Feedback> findById = this.feedbackRepo.findById(id);
		feedback = findById.get();
		return feedback;
		
	}
	
	
	//to fetch all records
	public List<Feedback> getFeedback()
	{
		List<Feedback> allFeedback = this.feedbackRepo.getAllFeedback();
		return allFeedback;
	}
	
	
	//to delete specific record when roll No is passed
	public void delete(int id) 
	{
		this.feedbackRepo.deleteById(id);
	}
	
	public Feedback update(Feedback feedback,int id) {
		Optional<Feedback> findById = this.feedbackRepo.findById(id);
		Feedback feedbackFound = findById.get();
		feedbackFound.setRollNo(feedback.getRollNo());
		feedbackFound.setName(feedback.getName());
		feedbackFound.setEmail(feedback.getEmail());
		feedbackFound.setFeedback(feedback.getFeedback());
		return feedbackRepo.save(feedbackFound);
	}
	
	
}
