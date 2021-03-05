public class DistanceDemo {

    public static void main(String[] args) {

        int kilometerValue = 12;

        double miles = kilometerToMiles(kilometerValue);
        double miles2 = kilometerToMiles(17);

        int kilometer27 = 27;
        double miles3 = kilometerToMiles(kilometer27);

        System.out.println(kilometerValue + " Kilometer entsprechen " + miles + " Meilen");
        System.out.println(17 + " Kilometer entsprechen " + miles2 + " Meilen");
        System.out.println(kilometer27 + " Kilometer entsprechen " + miles3 + " Meilen");

        double kilometer12 = milesToKilometer(miles);
        System.out.println(miles + " Meilen entsprechen " + kilometer12 + " Kilometer");
        System.out.println(miles2 + " Meilen entsprechen " + milesToKilometer(miles2) + " Kilometer");
        System.out.println(miles3 + " Meilen entsprechen " + milesToKilometer(miles3) + " Kilometer");

    }

    // Methode ist unabhängig vom Aufrufer
    public static double kilometerToMiles (double kilometer) {
        double result = kilometer / 1.609344;
        return result; // calculated miles
    }

    public static double milesToKilometer(double miles) {
        double result = miles * 1.609344;
        return result;
    }
}
