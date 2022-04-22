package com.bz.test;
	import static org.junit.Assert.*;
	import org.junit.Test;

	public class MoodAnalyzerTest {

		    @Test
		    public void sadMood(){
		    	MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am in Sad Mood");
		        String mood = null;
		        try {
		            mood = moodAnalyzer.analyMood();
		        }catch (MoodAnalysisException e){
		            System.out.println(e);
			    assertEquals("SAD",mood);
		        }

		    }

		    @Test
		    public void happyMood(){
		    	MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am in Happy Mood");
		        String mood = null;
		        try{
		            mood = moodAnalyzer.analyMood();
		            assertEquals("HAPPY",mood);
		        }catch (MoodAnalysisException e){
		            System.out.println(e);
		        }
		    }

		    @Test
		    public void returnHappy() {
		        String mood = null;
		        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain(null);
		        try{
		            mood = moodAnalyzer.analyMood();
		            assertEquals("Happy",mood);
		        }catch (MoodAnalysisException e){
		            System.out.println(e);
		        }
		    }

		    @Test
		    public void givenEmptyMood(){
		        String mood = null;
		        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
		        try{
		            mood = moodAnalyzer.analyMood();
		            assertEquals("Happy",mood);
		        }catch (MoodAnalysisException e){
		            System.out.println(e);
		        }
		    }
		}

