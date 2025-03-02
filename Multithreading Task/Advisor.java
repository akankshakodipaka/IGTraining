package com.insight;

import java.util.Random;

public class Advisor {
	public static void main(String[] args)
	{
		 String[] advices = {
		            "Never begin to stop and never stop to begin.",
		            "Only destination isn’t important, one should enjoy the journey.",
		            "Impossible itself says ‘I’m possible’",
		            "Believe in yourself and all that you are.",
		            "Success is not the key to happiness. Happiness is the key to success.",
		            "Do not go where the path may lead, go instead where there is no path and leave a trail.",
		            "The only way to do great work is to love what you do.",
		            "A journey of a thousand miles begins with a single step."
		        };
		        Random random = new Random();
		        int randomIndex = random.nextInt(advices.length); 
		        System.out.println("Here is your advice: ");
		        System.out.println(advices[randomIndex]);
		
	}

}
