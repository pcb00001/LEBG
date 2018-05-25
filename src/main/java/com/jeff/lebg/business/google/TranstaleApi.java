package com.jeff.lebg.business.google;

import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import com.machinepublishers.jbrowserdriver.Timezone;

public class TranstaleApi {

	public static String translate(String key) {
		JBrowserDriver driver = new JBrowserDriver(Settings.builder().timezone(Timezone.AMERICA_NEWYORK).build());
		// You can optionally pass a Settings object here,
		// constructed using Settings.Builder

		// This will block for the page load and any
		// associated AJAX requests
		driver.get("https://translate.google.com/?hl=vi#en/vi/hello");

		// You can get status code unlike other Selenium drivers.
		// It blocks for AJAX requests and page loads after clicks
		// and keyboard events.
		// System.out.println(driver.getStatusCode());

		// Returns the page source in its current state, including
		// any DOM updates that occurred after page load
		String rs = driver.getPageSource();
		System.out.println(rs);

		// Close the browser. Allows this thread to terminate.
		driver.quit();

		return rs;
	}

	public static void main(String[] args) {

		// You can optionally pass a Settings object here,
		// constructed using Settings.Builder
		JBrowserDriver driver = new JBrowserDriver(Settings.builder().timezone(Timezone.AMERICA_NEWYORK).build());

		// This will block for the page load and any
		// associated AJAX requests
		driver.get("https://translate.google.com/?hl=vi#en/vi/hello");

		// You can get status code unlike other Selenium drivers.
		// It blocks for AJAX requests and page loads after clicks
		// and keyboard events.
		//System.out.println(driver.getStatusCode());

		// Returns the page source in its current state, including
		// any DOM updates that occurred after page load
		String a = driver.getPageSource();
		System.out.println(driver.getPageSource());

		// Close the browser. Allows this thread to terminate.
		driver.quit();
	}

}
