package com.programmers.java.item9.code.yeon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class try_resouces_Main {
	public static void main(String[] args) throws IOException {
		String current = getCurrentDirectory();
		try (BufferedReader br = new BufferedReader(new FileReader(current + "/README.md"))) {
			br.readLine();
		}
	}

	private static String getCurrentDirectory() {
		return System.getProperty("user.dir");
	}

	public static void copy(String src, String dest) throws IOException {
		try (
				FileInputStream in = new FileInputStream(src);
				FileOutputStream out = new FileOutputStream(dest);
		) {
			byte[] buf = new byte[1024];
			int readData;
			while ((readData = in.read(buf)) > 0) {
				out.write(buf, 0, readData);
			}
		}
	}

	static String firstLineOfFile(String path, String defaultVal) {
		try (
				BufferedReader br = new BufferedReader(new FileReader(path))
		) {
			return br.readLine();
		} catch (IOException e) {
			return defaultVal;
		}
	}

}


