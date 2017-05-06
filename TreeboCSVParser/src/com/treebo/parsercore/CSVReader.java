package com.treebo.parsercore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.treebo.Expression.ExpressionHandler;
import com.treebo.String.StringHandler;
import com.treebo.handler.DataHandler;
import com.treebo.url.URLHandler;

public class CSVReader {

	String csvFile;
	String cvsSplitBy;
	DataHandler expressionHandler = new ExpressionHandler();
	DataHandler urlHandler = new URLHandler();
	DataHandler stringHandler = new StringHandler();
	List<String> Pattern = new ArrayList<String>();

	public String getHandler(int index, List<String> Pattern) {
		return (Pattern.get(index).toLowerCase());
	}

	public void parse(String csvFile, String cvsSplitBy) {

		this.csvFile = csvFile;
		this.cvsSplitBy = cvsSplitBy;

		String line = "";
		boolean PreparedPattern = false;

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				if (!PreparedPattern) {
					String[] headers = line.split(cvsSplitBy);
					for (String header : headers) {
						Pattern.add(header);
					}
					PreparedPattern = true;
					System.out.println(Pattern);
				} else {
					String[] dataArray = line.split(cvsSplitBy);

					for (int i = 0; i < dataArray.length; i++) {
						String data = dataArray[i];
						String handler = getHandler(i, Pattern);

						switch (handler) {
						case "string": {
							stringHandler.handle(data);
							break;
						}
						case "expression": {
							expressionHandler.handle(data);
							break;
						}
						case "url": {
							stringHandler.handle(data);
							break;
						}
						}

					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}