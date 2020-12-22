package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AnalyticsCounter {
	private static int headCount = 0; // headache counter
	private static int rashCount = 0; // rash counter
	private static int pupilCount = 0; // pupil counter

	public static void main(String args[]) throws Exception {
		// first get input
		String filePath = "Project02Eclipse\\symptoms.txt";
		String symptomPath = "Project02Eclipse\\symptomsList.txt";
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile(filePath);
		ReadSymptomDataFromFile symp = new ReadSymptomDataFromFile(symptomPath);

		List<String> symptoms = new ArrayList<>();
		symptoms = file.GetSymptoms();

		List<Symptom> symptomsList = new ArrayList<>();
		symptomsList = symp.GetSymptomsList();

		// System.out.println("Test");

		Symptom.symptomCounter(symptoms, symptomsList);

		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
