public class DemoCalcDigitSum {
    public static void main(String[] args) {

        // 54321 => 15
        // 9876543 = 42
        // 12 = 3

        System.out.println("calcDigitSum(54321) = " + calcDigitSum(54321));
        System.out.println("calcDigitSum(9876543) = " + calcDigitSum(9876543));
        System.out.println("calcDigitSum(12) = " + calcDigitSum(12));
        System.out.println("calcDigitSum(987654321) = " + calcDigitSum(987654321));
    }

    public static int calcDigitSum(int value) {
        // bis value = 0 => solange value > 0

        int digitsum = 0;
        while (value > 0){
            digitsum = digitsum + (value % 10); // 0 + 7 = 7
            value = value / 10; // number = 98
        }

        return digitsum;
    }
}
