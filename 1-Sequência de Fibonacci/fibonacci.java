public class fibonacci {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 0;

        System.out.println(number1);

        for ( int i= 0; i < 14; i++){
              number1= number1 + number2;
              number2 = number1 - number2;

              System.out.println(number1);

        }
          


    }

}