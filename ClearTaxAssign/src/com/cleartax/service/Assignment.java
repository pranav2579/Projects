package com.cleartax.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.cleartax.pojo.Equation;
import com.google.gson.Gson;

public class Assignment {

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		String json = null;
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			json = sb.toString();
		} finally {
			br.close();
		}
		Equation equation = gson.fromJson(json, Equation.class);
		System.out.println("Json converted to Object : " + equation.toString());

	}

}
