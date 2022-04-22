package com.bz.test;

public class MoodAnalyzerMain {
	
		private String msg;
		 public MoodAnalyzerMain() {
		    }
		 public MoodAnalyzerMain(String msg) {
		        this.msg = msg;
		    }
		 public String analyMood() throws MoodAnalysisException {
		        try {
		            if(msg.contains("SAD")){
		                return "SAD";
		            }
		            return "HAPPY";
		        }catch (NullPointerException e){
		            return "HAPPY";
	         }

		 }
	}

