package spaceLab_exploration;

import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.*;

public class SpaceLab_Exploration {

	/*
	 * Author Name:-shinde vaishnavi
	 * Program Name:-SpaceLab_Exploration.java
	 * Program Description:-This program is intended to provide prospect space explorer passengers with information they need to know before travelling on a space journey to other planets. Such information include:- finding their age and weight on the other planets in the solar system. 
	 
	 */
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
	{
		Scanner number=new Scanner(System.in);
		Scanner text=new Scanner(System.in);
		
		Main telescope_1=new Main();
		Main telescope_2=new Main();
		Main space_explorer=new Main();
		
		System.out.println("**************************************************************************************************");
		
		System.out.println("Please take a moment to listen to the welcome audio and repaly where necessary");

		System.out.println("**************************************************************************************************");
		
		//Inserting Audio
		
		File file=new File("SpaceLab.wav");
        AudioInputStream audiostream=AudioSystem.getAudioInputStream(file);
		Clip clip=AudioSystem.getClip();
		clip.open(audiostream);
		
		System.out.println("Enter P to play audio");
		String response=text.nextLine();
		response=response.toUpperCase();
		
		if(response.equals("P"))
		{
			clip.start();
			System.out.println("Enter S = Stop R = Replay");
			response=text.nextLine();
			response=response.toUpperCase();
			
			if(response.equals("S"))
			{
				clip.stop();
				System.out.println("Thank you!");
			}//if
			
			else if(response.equals("R"))
			{
				clip.setMicrosecondPosition(0);
				clip.start();
				
				System.out.println("Enter E to exit");
				response=text.nextLine();
				response=response.toUpperCase();
				clip.stop();
				System.out.println("Thank you!");
			}//else if
			 
		}//if
		
		System.out.println("**************************************************************************************************");
		
		System.out.println("Important Information About Focal Retio Of Telescopes");
		System.out.println("A longer focal ratio means a higher magnification which is great for observing the moon,planets and doule stars");
		System.out.println("A lower focal ratio means a lower magnification which is ideal for observing star clusters,galaxies and the milky way");
		System.out.println("**************************************************************************************************");
		
		//focal Ratio Telescope1 calculation
		
		telescope_1.focal_length=1000;
		telescope_1.aperture=102;
		telescope_1.focal_ratio=telescope_1.focal_length/telescope_1.aperture;
		
		//focal Ratio Telescope2 calculation
		
		telescope_2.focal_length=1270;
		telescope_2.aperture=250;
		telescope_2.focal_ratio=telescope_2.focal_length/telescope_2.aperture;
				
		//Display focal ratio for each telescope in tabular format
	
		System.out.println("---------------------------Focal Ratio For Telescopes---------------------------");
		
		System.out.printf("%35s","Telescop Names");
		System.out.printf("%15s","Focal Ratio");
		System.out.printf("%35s","Telescop Capacity Description");
		
		System.out.println();
	    
		System.out.printf("%35s","The Skwatcher Evostar 120(90 Degree)");
		System.out.printf("%15s",telescope_1.focal_ratio);
		System.out.printf("%5s","");
		
		if(telescope_1.focal_ratio>7)
		{
			System.out.printf("%s","Great for observing the Moon,Planet and Double stars");
		}
		
		else if(telescope_1.focal_ratio>= 1&& telescope_1.focal_ratio<=7)
		{
			System.out.printf("%s","Great for observinf the Clusters ,galaxies and the milky way");
			
		}//else if
		
		
        System.out.println();
	    
		System.out.printf("%35s","The Celestron Starhopper");
		System.out.printf("%15s",telescope_2.focal_ratio);
		System.out.printf("%5s","");
		
		if(telescope_2.focal_ratio>7)
		{
			System.out.printf("%s","Great for observing the Moon,Planet and Double stars");
		}
		
		else if(telescope_2.focal_ratio>= 1&& telescope_2.focal_ratio<=7)
		{
			System.out.printf("%s","Great for observinf the Clusters ,galaxies and the milky way");
			
		}//else if
		
		//choosing the telescope of their choice
		System.out.println();
		System.out.println("**************************************************************************************************");
		
		System.out.println("Which telescope do you choose?\nA.The Skwatcher Evostar 120\nB.The Celestron Starhopper\n");
		
		System.out.println("**************************************************************************************************");
		
		String user_choice=text.nextLine();
		
		if(user_choice.equals("A")||user_choice.equals("B"))
		{
		  System.out.println("Great Choice!");	
		  
		  //Age calculation section
		  System.out.println("**************************************************************************************************");
			
			System.out.println("Age Calculation In Other Planets");
			
			System.out.println("**************************************************************************************************");
			
			System.out.println("Enter your current age ");
		  space_explorer.spaceexplorer_age=number.nextDouble();
	     
		  //88 earth days = 1 year of mercury_terrestsge.
		  double mercury_terrestsge=(space_explorer.spaceexplorer_age*365)/88;
		
		  //225 earth days = 1 year of venus_terrestsge.
		  double venus_terrestsge=(space_explorer.spaceexplorer_age*365)/225;
		  

		  double mars_terrestsge=(space_explorer.spaceexplorer_age*365)/687;
		

		  double jupiter_outerage=space_explorer.spaceexplorer_age/12;
		 
		  double saturn_outerage=space_explorer.spaceexplorer_age/30;
		 
		  double uranus_outerage=space_explorer.spaceexplorer_age/84;
		
		  double neptune_outerage=space_explorer.spaceexplorer_age/165;
			
		  //weight calculation In other planet section
		  System.out.println("**************************************************************************************************");
			
		  System.out.println("weight(kg) Calculation In Other Planets");
			
		  System.out.println("**************************************************************************************************");
			
		  System.out.println("Enter your weight in kilograms");
		
		  space_explorer.spaceexplorer_weight=number.nextDouble();
		
		  //0.38 times gravity of mercury higher than earth.
		  double mercury_terrestweight=space_explorer.spaceexplorer_weight*0.38;
		  
		  double venus_terrestweight=space_explorer.spaceexplorer_weight*0.91;
		  
		  double mars_terrestweight=space_explorer.spaceexplorer_weight*0.38;
		  
		  double jupiter_gasgiantweight=space_explorer.spaceexplorer_weight*2.34;
		  
		  double saturn_gasgiantweight=space_explorer.spaceexplorer_weight*1.06;
		  
		  
		  double uranus_icegiantweight=space_explorer.spaceexplorer_weight*0.92;
		  
		  
		  double neptune_gasgiantweight=space_explorer.spaceexplorer_weight*1.19;
		  
		  //Display the age and the weight in other planets
		 
		  System.out.println("---------------------------Space Exploration Data Result---------------------------");
		  
		  System.out.printf("%20s","Planaet Names");
		  System.out.printf("%20s","Planaet Type");
		  System.out.printf("%20s","Age");
		  System.out.printf("%20s","Weight(kg)");
		 
		  System.out.println();
		  
		  System.out.printf("%20s","Mercury");
		  System.out.printf("%20s","Terrestrial");
		  System.out.printf("%20f",mercury_terrestsge);
		  System.out.printf("%20f",mercury_terrestweight);
		 
          System.out.println();
		  
		  System.out.printf("%20s","Venus");
		  System.out.printf("%20s","Terrestrial");
		  System.out.printf("%20f",venus_terrestsge);
		  System.out.printf("%20f",venus_terrestweight);
		 
         System.out.println();
		  
		  System.out.printf("%20s","Mars");
		  System.out.printf("%20s","Terrestrial");
		  System.out.printf("%20f",mars_terrestsge);
		  System.out.printf("%20f",mars_terrestweight);
		 
		  
          System.out.println();
		  
		  System.out.printf("%20s","Jupiter");
		  System.out.printf("%20s","Gas giants");
		  System.out.printf("%20f",jupiter_outerage);
		  System.out.printf("%20f",jupiter_gasgiantweight);
		  
         
          System.out.println();
		  
		  System.out.printf("%20s","Saturn");
		  System.out.printf("%20s","Gas giants");
		  System.out.printf("%20f",saturn_outerage);
		  System.out.printf("%20f",saturn_gasgiantweight);
		  
          System.out.println();
		  
		  System.out.printf("%20s","Uranus");
		  System.out.printf("%20s","Ice giants");
		  System.out.printf("%20f",uranus_outerage);
		  System.out.printf("%20f",uranus_icegiantweight);
		  
          System.out.println();
		  
		  System.out.printf("%20s","Neptune");
		  System.out.printf("%20s","Ice giants");
		  System.out.printf("%20f",neptune_outerage);
		  System.out.printf("%20f",neptune_gasgiantweight);
		  
		  //Conclusion Message To space Explorers
		  
		  System.out.println();
		  System.out.println("Thank you for using the space lab programmed system,have a wonderful space journey");
		}
		
		else
		{
			System.out.println("You have entered an incorrect option!,please restart the program");
		}
	
	}//main

}//class
