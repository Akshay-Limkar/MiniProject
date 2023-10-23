package com.miniproject.tables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class AddQuestionMethod {

	public void addQuestionMethod() throws IOException, ClassNotFoundException, SQLException {
		AddQuestionStatement addque = new AddQuestionStatement();
		System.out.println("Database connected");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many questions want to add: ");
		int num = Integer.parseInt(input.readLine());	
		
		for(int i = 1; i<=num ; i++) {
			System.out.println("Please enter question: ");
			String question = input.readLine();
			System.out.println("Please enter option_1: ");
			String option_1 = input.readLine();
			System.out.println("Please enter option_2: ");
			String option_2 = input.readLine();
			System.out.println("Please enter option_3: ");
			String option_3 = input.readLine();
			System.out.println("Please enter option_4: ");
			String option_4 = input.readLine();
				addque.addQuestion(question, option_1, option_2, option_3, option_4);
		}

	}

}
