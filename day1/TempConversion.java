package day1;
class ToCelsius {
    public void convert(double fahrenheit) {
        System.out.println((fahrenheit - 32) * 5 / 9 + "°C");
    }
}

class ToFahrenheit {
    public void convert(double celsius) {
        System.out.println(celsius * 9 / 5 + 32 + "°F");
    }
}

public class TempConversion {
    public static void main(String[] args) {
        ToCelsius toCelsius = new ToCelsius();
        toCelsius.convert(343.12);

        ToFahrenheit toFahrenheit = new ToFahrenheit();
        toFahrenheit.convert(211);
    }
}
