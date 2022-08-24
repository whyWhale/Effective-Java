package com.programmers.java.chap1.item9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class try_finally_Main {
	public static void main(String[] args) throws IOException {
		String current = getCurretDirectory();
		BufferedReader br = new BufferedReader(new FileReader(current + "/README.md"));
		try {
			br.readLine();
		} finally {
			br.close();
		}

	}

	private static String getCurretDirectory() {
		return System.getProperty("user.dir");
	}

	public static void copy(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		try {
			FileOutputStream out = new FileOutputStream(dest);
			try {
				byte[] buf = new byte[1024];
				int readData;
				while ((readData = in.read(buf)) > 0) {
					out.write(buf, 0, readData);
				}
			} finally {
				out.close();
			}
		} finally {
			in.close();
		}
	}
}
