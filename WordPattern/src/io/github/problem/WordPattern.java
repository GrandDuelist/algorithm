package io.github.problem;

import java.util.HashMap;

/*
public static void main(String[] agrs){
	String pattern = "abba";
	String str = "dog cat cat fish";
	
	WordPattern p  = new WordPattern();
	System.out.println(p.wordPattern(pattern, str));
	
	for(int i=0;i<strs.length;i++){
		System.out.println(strs[i].feq);
	}
}*/


public class WordPattern {
	
	 public boolean wordPattern(String pattern, String str) {
		HashMap<String,String> patternMap = new HashMap<String,String>(); 
		HashMap<String,Boolean> isUsed = new HashMap<String, Boolean>();
		
		String[] words = str.split(" ");
		
		if(words.length != pattern.length()){
			return false;
		}
		
		for (int i = 0;i<pattern.length();i++){
			String current = pattern.charAt(i)+"";
			String word = words[i];
			if(patternMap.get(word)==null){
				if(isUsed.containsKey(current)){
					return false;
				}
				patternMap.put(word, current);
				isUsed.put(current, true);
			}else if(!current.equals(patternMap.get(word))){
				return false;
			}
		}
		 
		 return true;
	  }
}
