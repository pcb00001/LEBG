package com.jeff.lebg.web;

import com.fasterxml.jackson.annotation.JsonView;
import com.jeff.lebg.business.AppResult;

public class AppResponse {

	public AppResult getResult() {
		return result;
	}

	public AppResponse(AppResult result) {
		super();
		this.result = result;
	}

	@JsonView(View.Summary.class)
	private AppResult result;
}
