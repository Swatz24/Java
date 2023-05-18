package PersonCalc;

public class Main {
    public static void main(String[] args) {
        Person mary;
        Person peter;
        Person longName;
        try {
            mary = new Person("Mary", 25);
            System.out.println(mary);
            // Throws exception for age > 120
            peter = new Person("Peter", 134);
            System.out.println(peter);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            // Exception for name characters > 40
            longName = new Person("mynameisoverfortycharactersIwillcauseanexceptiontobethrown", 21);
            System.out.println(longName);

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Calculator calc = new Calculator();
            calc.calculateFactorial(5);
            System.out.println("Factorial of the number 5 is " + calc.getResult());
            // Throws exception for negative numbers.
            calc.calculateFactorial(-2);
            System.out.println("Factorial of the number -2 is " + calc.getResult());

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

       Calculator c = new Calculator();
        c.calculateBinomialCoefficient(5,2);
        System.out.println("The binomial Co-efficient of (5,2) is " + c.calculateBinomialCoefficient(5,2));
        System.out.println("The binomial Co-efficient of (10,8) is " + c.calculateBinomialCoefficient(10,8));
        try{
        System.out.println("The binomial Co-efficient of (-3,2) is " + c.calculateBinomialCoefficient(-3,2));}
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}