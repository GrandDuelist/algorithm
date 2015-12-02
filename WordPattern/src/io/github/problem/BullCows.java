package io.github.problem;

import java.util.HashMap;

public class BullCows {
	
	public String getHint(String secret, String guess) {
       
	        
	        if(secret.length() != guess.length())
	        {
	        	return null;
	        }
	        
	        HashMap <Integer, Integer> wordNum= new HashMap <Integer, Integer>();
	        HashMap<Integer, Boolean> isChecked= new HashMap<Integer, Boolean>();
	        int countBull = 0;
	        int countCow = 0;
	        
	        for(int i=0;i<secret.length();i++){
	        	
	        	int currentKey  = (int)secret.charAt(i);
	        	
	        	if(wordNum.containsKey(currentKey)){
	        		wordNum.put(currentKey,wordNum.get(currentKey)+1);
	        	}else{
	        		wordNum.put(currentKey, 1);
	        	}
	        }
	        
	        
	        for(int i=0;i<guess.length();i++){
	        	int currentGue =(int) guess.charAt(i);
	        	int currentSec =(int) secret.charAt(i);
	        	
	        	if(currentSec == currentGue){
	        		countBull++;
	        		wordNum.put(currentSec,wordNum.get(currentSec)-1);
	        	}
	        }
	        
	        for(int i=0;i<guess.length();i++){
	        	int currentGue =(int) guess.charAt(i);
	        	int currentSec =(int) secret.charAt(i);
	        	
	        	if(currentSec != currentGue){
	        	{
	        		if(wordNum.containsKey(currentGue)&&wordNum.get(currentGue)>0){
	        			countCow++;
	        			wordNum.put(currentGue, wordNum.get(currentGue)-1);
	        		}
	        		
	        	} }
	        	}
	        return countBull+"A"+countCow+"B";
        
    }
}
