package com.hemebiotech.analytics;

import java.util.TreeMap;

public class AnalyticsCounter {

	private static TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

	public AnalyticsCounter() {

	}

	public static void start() {
		String filePath = "Project02Eclipse\\symptoms.txt";
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile(filePath);
		treeMap = file.GetSymptoms();
		System.out.println(treeMap);
		WriteSymptomDataToFile extract = new WriteSymptomDataToFile(treeMap);
		System.out.println("Operation over.");
	}

}