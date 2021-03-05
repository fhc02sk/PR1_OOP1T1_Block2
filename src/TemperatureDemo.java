public class TemperatureDemo {

    public static void main(String[] args) {

        double temperatureCelsiusCampus = 11.8;
        double temperatureCelsiusKapfenberg = 4.91122;

        double fahrenheitCampus = celsiusToFahrenheit(temperatureCelsiusCampus);
        double fahrenheitKapfenberg = celsiusToFahrenheit(temperatureCelsiusKapfenberg);

        System.out.println("Aktuelle Temperatur am Campus "
                + temperatureCelsiusCampus + " in Celsius entspricht " + fahrenheitCampus + " in Fahrenheit");
        System.out.println("Aktuelle Temperatur in Kapfenberg "
                + temperatureCelsiusKapfenberg + " in Celsius entspricht " + fahrenheitKapfenberg + " in Fahrenheit");
        System.out.println("65 °Fahrenheit in Miami entsprechen " + fahrenheitToCelsius(65) + "°C");


        System.out.println(fahrenheitToCelsius(fahrenheitCampus));
        System.out.println(fahrenheitToCelsius(fahrenheitKapfenberg));


    }

    public static double celsiusToFahrenheit(double celsius){
        double result = celsius * 1.8 + 32;
        return result;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
}
