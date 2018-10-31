package com.marlabs.staticAndInstance;

import java.util.HashMap;
import java.util.Map;

public class MainSingleTon {

	private static MainSingleTon mainSingleTonInstance = null;

	public synchronized static MainSingleTon getInstance() {
		if (mainSingleTonInstance == null) {
			mainSingleTonInstance = new MainSingleTon();
		}
		return mainSingleTonInstance;
	}

	private MainSingleTon() {
		System.out.println("MainSingleTon Const");
	}

	public void loadUserDetails() {
		System.out.println("UserName Password Combination");
		Map<String, String> loginDetailsMap = new HashMap<String, String>();
		loginDetailsMap.put("C001", "Pass1");
		loginDetailsMap.put("C002", "Pass2");
		loginDetailsMap.put("C003", "Pass3");
		loginDetailsMap.put("C004", "Pass4");
		loginDetailsMap.put("C005", "Pass5");
		loginDetailsMap.put("C006", "Pass6");
	}

}
