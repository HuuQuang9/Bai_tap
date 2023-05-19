package day7.example;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap ten thanh pho:");
        String city = input.nextLine();
        switch (city){
            case "An Giang":
            case "Vũng Tàu":
            case "Bạc Liêu":
            case "Bắc Kạn":
            case "Bắc Giang":
            case "Bắc Ninh":
            case "Bình Dương":
            case "Bình Định":
            case "Bình Phước":
            case "Bình Thuận":
            case "Bến Tre":
            case "Cà Mau":
            case "Cao Bằng":
            case "Cần Thơ":
            case "Đà Nẵng":
            case "Điện Biên":
            case "Đắk Lắk":
            case "Đắk Nông":
            case "Đồng Nai":
            case "Đồng Tháp":
            case "Gia Lai":
            case "Hà Giang":
            case "Hà Nam":
            case "Hà Nội":
            case "Hà Tĩnh":
            case "Hải Dương":
            case "Hải Phòng":
            case "Hậu Giang":
            case "Hòa Bình":
            case "Hồ Chí Minh":
            case "Hưng Yên":
            case "Khánh Hoà":
            case "Kiên Giang":
            case "Kon Tum":
            case "Lai Châu":
            case "Lạng Sơn":
            case "Lào Cai":
            case "Lâm Đồng":
            case "Long An":
            case "Nam Định":
            case "Nghệ An":
            case "Ninh Bình":
            case "Ninh Thuận":
            case "Phú Thọ":
            case "Phú Yên":
            case "Quảng Bình":
            case "Quảng Nam":
            case "Quảng Ngãi":
            case "Quảng Ninh":
            case "Quảng Trị":
            case "Sóc Trăng":
            case "Sơn La":
            case "Tây Ninh":
            case "Thái Bình":
            case "Thái Nguyên":
            case "Thanh Hoá":
            case "Thừa Thiên Huế":
            case "Tiền Giang":
            case "Trà Vinh":
            case "Tuyên Quang":
            case "Vĩnh Long":
            case "Vĩnh Phúc":
            case "Yên Bái":
                WeatherCityInVietNam weatherCityInVietNam = new WeatherCityInVietNam();
                System.out.println("Thoi tiet cua thanh pho "+city+" cua Viet Nam : "+ weatherCityInVietNam.getWeather(city));
                break;
            default:
                WeatherAdapter weatherAdapter = new WeatherAdapter();
                System.out.println("Thoi tiet cua thanh pho "+city+": "+ weatherAdapter.getWeather(city));
                
        }
    }
}
