package day7.example;

import java.util.Random;

public class WeatherCityInVietNam implements Weather{

    public WeatherCityInVietNam() {
    }

    @Override
    public String getWeather(String city) {
//        System.out.println("Thoi tiet hien tai cua thanh pho "+ city+":" );
//        int nhietDo = new Random().nextInt(10)+30 ;
//        System.out.println("Nhiet do: "+ nhietDo);
//        int doAm = new Random().nextInt(40)+40;
//        System.out.println("Do am: "+doAm+"%");
        int nhietDo = new Random().nextInt(10)+30 ;
        int doAm = new Random().nextInt(40)+40;
        return "[Temperature: " + nhietDo + "°C, Humidity: " + doAm + "%]";

    }
}
