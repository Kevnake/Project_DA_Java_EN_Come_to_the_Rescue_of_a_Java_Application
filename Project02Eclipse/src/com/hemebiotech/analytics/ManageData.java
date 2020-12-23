package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ManageData {

	public ManageData() {

	}

	public TreeMap<String, Integer> CollectData(String filepath) {
		TreeMap<String, Integer> dataCollection = new TreeMap<String, Integer>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					if (dataCollection.containsKey(line)) {
						dataCollection.put(line, (dataCollection.get(line) + 1));
						line = reader.readLine();
					} else {
						dataCollection.put(line, 1);
						line = reader.readLine();
					}
				}

				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dataCollection;
	}

	public void ExtractData(TreeMap<String, Integer> map) {
		try {
			FileWriter writer = new FileWriter("result.out");
			Iterator i = map.entrySet().iterator();
			while (i.hasNext()) {
				Map.Entry me = (Map.Entry) i.next();
				writer.write("Symptom : " + me.getKey() + "  Occurence :" + me.getValue() + "\n");
			}

			writer.close();
			System.out.println("Files result.out generated.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}