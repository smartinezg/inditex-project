package com.example.inditex.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.inditex.persistence.Prices;
import com.example.inditex.repository.PricesRepository;

@Controller
@RequestMapping(path="/prices")
public class PricesController {

	@Autowired
	private PricesRepository pricesRepository;

	@GetMapping(path="/allPrices")
	public @ResponseBody ResponseEntity<List<Prices>> getAllPrices() {
		List<Prices> prices = pricesRepository.findAll();
		if (prices == null) {
			return new ResponseEntity<>(prices, HttpStatus.NOT_FOUND);
		} else if (prices != null && !prices.iterator().hasNext()) {
			return new ResponseEntity<>(prices, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(prices, HttpStatus.OK);
	}
	
}