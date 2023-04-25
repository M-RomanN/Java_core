package hw_lesson_6;

import java.io.IOException;
//import java.time.Period;

public interface WeatherModel {
    void getWeather(String selectCity, Period period) throws IOException;
}
