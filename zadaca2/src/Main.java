public class Main {
    public static void main(String[] args) {
       /* int amountInCashRegister = 99;
        int checkAmount = 66;
        int KM20 = 20;
        int KM10 = 10;
        int KM2=2;
        int KM1=1;
        int moneyAmount = 100;
        int changeAmount;



        if ((amountInCashRegister > 100) &&  (checkAmount >0)){
            System.out.println("You have too much money");
        }       else if (checkAmount<=0) {
             System.out.println("You didnt buy anything did you");
        }       else {
                 changeAmount = moneyAmount - checkAmount;
                     System.out.println("Your change is " + changeAmount + " KM");
                        KM20=changeAmount%20;
                        System.out.println(KM20);

                     }
        if (checkAmount<0) {

            System.out.println("Did you maybe break something");
        }
*/


            // Zadatak 2. - površina kruga

         /* double areaOfCircle;
                double radiusOfCircle=0.1;
                double piNumber = 3.14;
                if (radiusOfCircle>0) {
            areaOfCircle = radiusOfCircle * radiusOfCircle * piNumber;
            System.out.println("Površina kruga je:  " + areaOfCircle);
        }   else {
                    System.out.println("Radijus kruga treba biti veći od nule !");
                }  */

            // Zadatak 3. - djeljivost brojeva

        /*   int A=40;
            int B=4;
            if ((A%B == 0) && (A>10) && (A%3 == 0) && (A<10000)) {
                System.out.println("Broj " + A + " je djeljiv sa " + B );
            } else  if (A%B ==0){
                System.out.println("Broj " + A + " je djeljiv sa "+ B + " ali ne zadovoljava ostale uslove !");
            }  else {
                System.out.println("Broj " + A + " nije djeljiv sa " + B );

            } */

            //Zadatak 4.

        /*    int A = 15;
            int B = 10;
            int sum = A + B;
            int difference = B-A;
            int product = A*B;
            if (A>B){
                System.out.println("Zbir " + A + " i " + B+ " je: " + sum);
            }  else if (A<B) {
                System.out.println("Razlika " + B + " i " + A+ " je: " + difference);
            } else if (A==B){
            System.out.println("Proizvod " + A + " i " + B +" je: " + product);
        } */

       // Zadatak 5.
      /*   int X = 1;
         boolean variable1 = (((((X+X+6)/2)-X)%2) == 0);
        if  (variable1 == true) {
            System.out.println("(((( " + X + " + " + X + " + " + " 6 " + ")" + "/2))" + " - " + X + ") je djeljivo sa 2");
        } else {
            System.out.println("(((( " + X + " + " + X + " + " + " 6 " + ")" + "/2))" + " - " + X + ") nije djeljivo sa 2");

        } */

       // Zadatak 6.
            int A,B,C,D;
            A=1;
            B=1;
            C=1;
            D=1;

            if ( ((A>0) &&(B>0)) || ((C>0) && (D>0))   ) {
                int sum = A+B+C+D;
                System.out.println("Zbir je : " + sum);

                if (sum>100)
            }

        System.out.println();
    }
}