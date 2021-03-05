public class LoopDemo {

    public static void main(String[] args) {


        // while => solange die Bedingung
        // while (Bedingung)

        /*while (true) {
            System.out.println("Der Pinguin schlug die Zeitung auf, da Stand:");
        }*/

        // genau 100 mal ausgegeben
        int counter = 100;
        while (counter > 0) {
            counter--; // counter = counter - 1;
            System.out.println(counter + ": Der Pinguin schlug die Zeitung auf, da Stand:");
        }

        /*
        * Write a while loop, which counts from 1 to 100
        * it should print the number and
        *   odd => "ping"
        *   even => "pong"
        *
        * Expected result
        *   1 ping
        *   2 pong
        *   3 ping
        *   4 pong
        *   5 ping
        *   6 pong
        * */

        int counter1 = 1;
        while (counter1 <= 100) {
            System.out.print(counter1);
            if (counter1 % 2 == 0){
                System.out.println(" pong");
            }
            else {
                System.out.println(" ping");
            }

            counter1++;
        }

        /* Write a loop, which displays all numbers between 1 and 500, which could by divided by 3, 5 or 7 */
        /*int counter2 = 1;
        while (counter2 <= 500){
            if (counter2 % 3 == 0) {
                System.out.println(counter2);
            } else if (counter2 % 5 == 0) {
                System.out.println(counter2);
            } else if (counter2 % 7 == 0) {
                System.out.println(counter2);
            }
            counter2++;
        }*/


        int counter2 = 1;
        while (counter2 <= 500){
            if (counter2 % 3 == 0 || counter2 % 5 == 0 || counter2 % 7 == 0) {
                System.out.println(counter2);
            }
            counter2++;
        }

        int counter3 = 500;
        while (counter3 < 100) {
            System.out.println("counter < 100");
        }

        do {
            System.out.println("do counter < 100");
        } while (counter3 < 100);
    }
}
