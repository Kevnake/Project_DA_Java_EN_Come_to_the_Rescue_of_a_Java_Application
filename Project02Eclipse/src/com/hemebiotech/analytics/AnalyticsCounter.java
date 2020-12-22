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
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile(filePath);

		// BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		// String line = reader.readLine();

		List<String> symptoms = new ArrayList<>();
		symptoms = file.GetSymptoms();

		int i = 0; // set i to 0
		for (i = 0; i < symptoms.size(); i++) {
			System.out.println("symptom from file: " + symptoms.get(i));
			if (symptoms.get(i).equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			} else if (symptoms.get(i).equals("rash")) {
				rashCount++;
				System.out.println("number of rash: " + rashCount);
			} else if (symptoms.get(i).contains("pupils")) {
				pupilCount++;
				System.out.println("number of pupil: " + pupilCount);
			}
		}

		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
