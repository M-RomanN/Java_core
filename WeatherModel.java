package hw_lesson_6_7_8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
//import java.time.Period;

public interface WeatherModel {
    void getWeather(String selectCity, Period period) throws IOException, SQLException;
    List<Weather> getSavedToDBWeather();

    List<Weather> getSavedToDataBaseWeather();
}
