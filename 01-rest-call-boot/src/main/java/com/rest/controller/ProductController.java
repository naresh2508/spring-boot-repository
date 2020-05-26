package com.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dto.Receipt;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping(produces="application/xml")
	@RequestMapping("/{productNo}")
	public ResponseEntity<Receipt> getProduct(@PathVariable("productNo") String productNo) {
		Receipt receipt = null;
		ResponseEntity<Receipt> responseEntity = null;

		receipt = new Receipt();
		receipt.setMobileNo("989898998");
		receipt.setBalance(100);
		responseEntity = new ResponseEntity<>(receipt, HttpStatus.CREATED);
		return responseEntity;
		
	}
}
