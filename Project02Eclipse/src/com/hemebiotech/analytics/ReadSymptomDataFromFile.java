package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	private ManageData md = new ManageData();

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public TreeMap<String, Integer> GetSymptoms() {
		TreeMap<String, Integer> result = new TreeMap<String, Integer>();
		result = md.CollectData(filepath);

		return result;
	}

}
