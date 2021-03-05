public class FindFactorDemo {

    public static void main(String[] args) {

        /*
            21 = 1, 3, 7, 21
            30 = 1, 2, 3, 5, 6, 10, 15, 30
            10 = 1, 2, 5, 10

            - What is the aim of the method => name => findFactors()
            - What is required to do the work => parameters => int number
            - What needs the method to return to the caller => return value => void

         */
        findFactors(21);
        findFactors(10);
        findFactors(30);
        findFactors(3981);
    }

    public static void findFactors(int number) {
        // He kid
        // take every number between 1 and your goal (number)
        // try out, if your goal (number) can be divided by your current number
        // if yes, print out the number and try next
        // if no, try next

        System.out.println("Faktoren für " + number);
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0){
                System.out.print(counter + ", ");
            }
            counter++;
        }
        System.out.println();
    }
}
