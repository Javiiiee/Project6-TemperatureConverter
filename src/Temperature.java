import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("do you wish to convert fahreinheit or celsius?");

        switch (sc.next()){
            case "fahrenheit":
                System.out.println("converting fareinheit to celsius, please enter temperature:");
                System.out.println(fahreinheitToCelsius(sc.nextDouble()));
            case "celsius":
                System.out.println("Converting celsius to fareinheit, please enter temperature:");
                System.out.println(celsiusToFahreinheit(sc.nextDouble()));
        }
    }
    public static double celsiusToFahreinheit (double celsius){
        double fahreinheit = (9.0/5)*celsius+32;
        return fahreinheit;
    }
    public static double fahreinheitToCelsius (double fahreinheit){
        double celsius = (5.0/9)*(fahreinheit-32);
        return celsius;
    }
}
