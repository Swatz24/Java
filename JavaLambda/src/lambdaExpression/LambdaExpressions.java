package lambdaExpression;

public class LambdaExpressions {
    public static void main(String[] args) {
        // Addition
        Arithmetic addition =  (a,b) -> a+b;
        System.out.println("Addition (5,2) : " + addition.operations(5,2));
        System.out.println("Addition (15,2) : " + addition.operations(15,2));
        System.out.println("Addition (10,20) : " + addition.operations(10,20));

        // Subtraction

        Arithmetic subtraction = (a,b) ->  Math.abs(a-b);
        System.out.println("Subtract (20,10): " + subtraction.operations(20,10));

        // Multiplication

        Arithmetic multiply = (a,b) -> a*b;
        System.out.println("Multiplication (2,5): " + multiply.operations(2,5));

        // Division

        Arithmetic division = (a,b) ->{
            if(b==0){
                System.out.println("Denominator cannot be zero. Give valid input.");
                return 1;
                            }
            else{
                return a/b;
            }

        };
        System.out.println("Division: " + division.operations(10,2));
        System.out.println("Division: " + division.operations(20,0));

        // Use lambda expressions with functional interfaces.
        AnimalSound cat = () -> System.out.println("Meow!!");
        cat.makeSound();

        AnimalSound Dog = () -> System.out.println("Woof Woof!!");
        Dog.makeSound();

        AnimalSound Lion = () -> System.out.println("Roar!!");
        Lion.makeSound();

    }
}
