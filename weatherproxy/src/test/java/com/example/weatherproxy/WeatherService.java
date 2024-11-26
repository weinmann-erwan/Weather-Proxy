package test.java.com.example.weatherproxy;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate = new RestTemplate();

    public double getAverageTemperatureByGeolocation(double latitude, double longitude, int days) {
        // Call Open-Meteo API and calculate average temperature
        // Example URL: https://api.open-meteo.com/v1/forecast?latitude={latitude}&longitude={longitude}&daily=temperature_2m_max&start={start_date}&end={end_date}
        // Parse response and calculate average
        return 0.0; // Placeholder
    }

    public double getAverageTemperatureByLocation(String location, int days) {
        // Convert location to geolocation using a geocoding service
        // Call getAverageTemperatureByGeolocation with the obtained latitude and longitude
        return 0.0; // Placeholder
    }
}