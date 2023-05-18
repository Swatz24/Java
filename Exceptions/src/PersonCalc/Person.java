package PersonCalc;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {

            if( name.isEmpty() || name.equals(" ") || name.length() >40 || age < 0 || age>120){

                if( name.isEmpty() || name.equals(" ") || name.length() >40 && (age < 0 || age>120)){
                    throw new IllegalArgumentException("Enter valid name and valid age."); // Exception message if both name and age are invalid.
                }

               else if(name.isEmpty() || name.equals(" ") || name.length() >40)
                {
                     throw new IllegalArgumentException("Enter a name with characters between 1-40 .");} // Exception message if name is invalid.

                else if(age < 0 || age>120) {
                    throw  new IllegalArgumentException("Age cannot be below 0 or above 120");  // Exception message if the age is invalid.
                }
        }

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + " is " + age + " years old.";
    }
}
