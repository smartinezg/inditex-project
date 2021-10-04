package com.example.inditex.controllers;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.inditex.persistence.Prices;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PricesControllerTest {

	@Autowired
	PricesController pricesController;

	/*
	@Test
	public void testGetAllPrices() {
		ResponseEntity<List<Prices>> pricesList = pricesController.getAllPrices();
		
		pricesList.getBody().forEach((p)->{
			System.out.println(p);
		});
		pricesList.getStatusCode().is2xxSuccessful();
	}
	*/

}
