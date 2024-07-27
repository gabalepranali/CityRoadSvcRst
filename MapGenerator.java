import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapGenerator {
    private static final int NUMBER_OF_CITIES = 100;

    public static List<City> generateRandomCities() {
        List<City> cities = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < NUMBER_OF_CITIES; i++) {
            String name = "City" + (i + 1);
            double latitude = -90 + 180 * random.nextDouble();  // Latitude range: -90 to 90
            double longitude = -180 + 360 * random.nextDouble();  // Longitude range: -180 to 180
            cities.add(new City(name, latitude, longitude));
        }
        return cities;
    }

    public static void main(String[] args) {
        List<City> cities = generateRandomCities();
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
