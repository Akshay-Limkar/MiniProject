package com.miniproject.quizapplication;
import com.miniproject.tables.AddQuestionMethod;

public class QuizApplication {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		AddQuestionMethod addQuestionMethod = new AddQuestionMethod();
		
		try {
			addQuestionMethod.addQuestionMethod();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("End");
	}

}
