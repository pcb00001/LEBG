package com.jeff.lebg.business;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonView;
import com.jeff.lebg.web.View;

public class AppResult {
	
	@JsonView(View.Summary.class)
	private Set<String> vnText;

	public AppResult(Set<String> vnText) {
	    super();
	    this.vnText = vnText;
	  }

	public Set<String> getVnText() {
		return vnText;
	}


}
