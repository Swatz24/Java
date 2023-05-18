package PersonCalc;

public class Calculator {

    private int result;
    public Calculator() {
        this.result = 1;
    }

    public int calculateFactorial(int n){
        if(n < 0){
            throw new IllegalArgumentException("Enter a number greater than 0. Negative numbers are invalid input.");
        }

        if (n == 0) {

            return 1;
        }else{
            result = 1;
        for(int i=1; i <= n; i++){
           result *= i;
        }

        return result;
        }
    }

    public int calculateBinomialCoefficient(int a, int b){
        int biCo;

            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("Input values should be greater then zero.");
            }
            if (b > a) {
                throw new IllegalArgumentException("Subset cannot be greater than the main set");
            }


        biCo = calculateFactorial(a)/ ( calculateFactorial(b) * calculateFactorial(a-b)) ;
            return biCo;


                }



    public int getResult() {
        return result;
    }
}
