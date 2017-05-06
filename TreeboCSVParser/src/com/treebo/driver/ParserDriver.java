package com.treebo.driver;

import com.treebo.parsercore.CSVReader;

public class ParserDriver {

	public static void main(String[] args) {

		String csvFile = "/Users/Pranav/Desktop/sample_csv_data.csv";
		String cvsSplitBy = ",";

		CSVReader csvReader = new CSVReader();
		csvReader.parse(csvFile, cvsSplitBy);

	}
}