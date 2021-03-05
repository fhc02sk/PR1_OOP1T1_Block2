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
    }

    // Methode ist unabhängig vom Aufrufer
    public static double kilometerToMiles (double kilometer) {
        double result = kilometer / 1.609;
        return result; // calculated miles
    }
}
