package com.example.services;

import java.util.List;

import com.example.entity.Feedback;

public interface FeedbackInterface {
	
	public Feedback addFeedback(Feedback feedback);
	public Feedback getFeedback(int id);
	public List<Feedback> getFeedback();
	public void delete(int id);
	public Feedback update(Feedback feedback,int id);
	
}
