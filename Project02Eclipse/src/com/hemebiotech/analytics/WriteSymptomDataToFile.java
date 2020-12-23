package com.hemebiotech.analytics;

import java.util.TreeMap;

public class WriteSymptomDataToFile {

	private ManageData md = new ManageData();

	public WriteSymptomDataToFile(TreeMap<String, Integer> map) {
		md.ExtractData(map);
	}

}
