package com.self.codebat.resursive;

public class ChangePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String changePi(String str) {

		if (!str.contains("pi")) {

			return str;
		} else {
			return changePi(str.replaceFirst("pi", "3.14"));

		}

	}

}
