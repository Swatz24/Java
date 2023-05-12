public class Animal {
    private String name;
    private boolean isDog;

    private int age;
    private double weight;
    private String color;

    public Animal(String name, boolean isDog, int age, double weight, String color) {
        this.name = name;
        this.isDog = isDog;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }


    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String print() {

            return getName() + " is a dog = " + getIsDog() + "\n";
        }

    public String printDog()
        {
            return getName() + " is a dog = " + getIsDog() + " and its " + getAge() + " years old.\n" + getName() + " weighs " + getWeight() + " pounds and is "
                    + getColor() + " in color. \n";
        }

}

