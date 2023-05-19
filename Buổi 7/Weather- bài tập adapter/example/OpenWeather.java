package day7.example;

import java.util.Random;

public class OpenWeather {
    String getWeatherCity(String cityName){
        int nhietDoF = new Random().nextInt(60)+60;
        int doAm = new Random().nextInt(40)+ 40 ;
        int gio = 3 ;
        int apSuat = 100 ;

        return "[Hump: "+doAm+"% , Temp: "+nhietDoF+"°F, Pressure: "+apSuat+"Pa, Wind speed: "+gio+"m/s]";
    }
    String getWeatherCityByZipCode(int zipCode){
        int nhietDoF = new Random().nextInt(60)+60;
        int doAm = new Random().nextInt(40)+ 40 ;
        int gio = 3 ;
        int apSuat = 100 ;

        return "[Hump: "+doAm+"% , Temp: "+nhietDoF+"°F, Pressure: "+apSuat+"Pa, Wind speed: "+gio+"m/s]";
    }
    String getWeather(int loc, int lat){
        // demo len ko lay vi tri chinh xac
        int nhietDoF = new Random().nextInt(60)+60;
        int doAm = new Random().nextInt(40)+ 40 ;
        int gio = 3 ;
        int apSuat = 100 ;

        return "[Hump: "+doAm+"% , Temp: "+nhietDoF+"°F, Pressure: "+apSuat+"Pa, Wind speed: "+gio+"m/s]";
    }
}
