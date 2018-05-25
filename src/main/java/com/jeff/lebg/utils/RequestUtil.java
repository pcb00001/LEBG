package com.jeff.lebg.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RequestUtil {

	public static String getContentUrl(String url) {
		String rs = "";
		try {
			URL oracle = new URL(url);
			BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				rs += inputLine;
			in.close();
		} catch (Exception e) {
			throw new RuntimeException(String.format("getContentUrl by [%s] is failed", url));
		}
		return rs;
	}
}
