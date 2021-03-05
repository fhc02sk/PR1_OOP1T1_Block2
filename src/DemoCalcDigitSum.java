public class DemoCalcDigitSum {
    public static void main(String[] args) {

        // 54321 => 15
        // 9876543 = 42
        // 12 = 3
    }

    public static int calcDigitSum(int value) { // Method signature
        int ziffersumme = 0;
        ziffersumme = ziffersumme + (value % 10); // 0 + 7 = 7
        value = value / 10; // number = 98
        ziffersumme = ziffersumme + (value % 10); // 7 + 8 = 15
        value = value / 10; // number = 9
        ziffersumme = ziffersumme + (value % 10); // 15 + 9 = 24
        value = value / 10; // number = 0

        return ziffersumme;
    }
}
