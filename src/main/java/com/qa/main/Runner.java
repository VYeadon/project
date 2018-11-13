package com.qa.main;

import com.qa.other.Service;

import come.qa.objectToJson.ConvertObjectsToJSON;

public class Runner {
	
	public static void main( String[] args )
    {
		Service runnerObj = new Service();
		
		runnerObj.setPerson("mical", "person");
		runnerObj.setPerson("Rohean", "Otherperson");
		
		runnerObj.getPerson(1);
		runnerObj.getPerson(2);
		
		ConvertObjectsToJSON JSONConverter = new ConvertObjectsToJSON();
		
		JSONConverter.objectToJSONConverter(runnerObj.getPersonAccountObject(1));
		JSONConverter.objectToJSONConverter(runnerObj.getPersonAccountObject(2));
	}

}
