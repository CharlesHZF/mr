package com.importsource.mr.core;

public class WordMapper extends AbstractMR implements Mapper  {

	public void map(String text) {
		put(text);
	}
	
	private  void put(String text){
		String[] strArr =splitLine(text);
		for(int i=0;i<strArr.length;i++){
			if(map.containsKey(strArr[i])){
				String value1=map.get(strArr[i]).toString();
				map.remove(strArr[i]);
				map.put(strArr[i], value1+","+1);
			}else{
				map.put(strArr[i], 1);
			}
		}
		
	}
	
	
	private static final String REGEX = "[ ]";

	

}
