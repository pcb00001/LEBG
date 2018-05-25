package com.jeff.lebg.web.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.jeff.lebg.business.AppResult;
import com.jeff.lebg.business.google.TranstaleApi;
import com.jeff.lebg.web.AppResponse;
import com.jeff.lebg.web.View;

@RestController
@EnableAutoConfiguration
public class MainController {

	@JsonView(View.Summary.class)
	@RequestMapping(value = "/google/call", method = RequestMethod.POST)
	public ResponseEntity<AppResponse> callTranslate(@RequestBody AppRequest request, HttpServletRequest httpRequest) {
		Set<String> vnText = new HashSet<String>();
		vnText.add(TranstaleApi.translate(""));
		AppResponse results = new AppResponse(new AppResult(vnText));
		return new ResponseEntity<AppResponse>(results, HttpStatus.OK);
	}

}
