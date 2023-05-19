package day7.example;

public class WeatherAdapter implements Weather{
    OpenWeather openWeather ;

    public WeatherAdapter() {
        this.openWeather = new OpenWeather();
    }

    @Override
    public String getWeather(String city) {
        String s =  openWeather.getWeatherCity(city);
        String[] s1 = s.split(": ");
        String[] s2 = s1[1].split("%");
        String[] s3 = s1[2].split("°F");
        int doAm = Integer.parseInt(s2[0]);
        int nhietDoF = Integer.parseInt(s3[0]);
        int nhietDoC = (int) ((nhietDoF - 32) / 1.8);

        return "[Temperature: " + nhietDoC + "°C, Humidity: " + doAm + "%]";
    }
}
