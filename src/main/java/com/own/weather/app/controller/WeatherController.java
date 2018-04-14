package com.own.weather.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * The Class WeatherController.
 */
@Controller
@RequestMapping("/weather")
public class WeatherController {

	/** The rest template. */
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * Gets the weather data.
	 *
	 * @param city the city
	 * @return the weather data
	 */
	@RequestMapping("/data")
	public String getWeatherData(String city) {
		
		return restTemplate.getForObject("api.openweathermap.org/data/2.5/weather?q=London", String.class);
	}
	
}
