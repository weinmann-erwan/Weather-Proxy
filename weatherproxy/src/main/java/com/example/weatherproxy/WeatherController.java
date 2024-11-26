package com.example.weatherproxy;

import com.example.weatherproxy.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/geolocation")
    public double getAverageTemperatureByGeolocation(@RequestParam double latitude, @RequestParam double longitude, @RequestParam int days) {
        return weatherService.getAverageTemperatureByGeolocation(latitude, longitude, days);
    }

    @GetMapping("/location")
    public double getAverageTemperatureByLocation(@RequestParam String location, @RequestParam int days) {
        return weatherService.getAverageTemperatureByLocation(location, days);
    }
}