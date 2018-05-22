package com.javainuse.waterBills;

import io.swagger.annotations.ApiParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.Incubating;
import springfox.documentation.spring.web.json.Json;

@RestController
public class WaterBillsController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String WaterBills(@ApiParam(value = "testId")  String id) {
		waterBills obj = new  waterBills(); 
		return obj.getWaterBill(id); //"Swagger Hello World"+ id ;
	}
}
