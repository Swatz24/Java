package application;

public class Main {
    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());

        Sensor kumpula = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();
        helsinkiVantaaAirport.setOn();

        // try catch block to catch exceptions.
        try {

            kumpula.setOn();
            System.out.println("Temperature at kumpala: " + kumpula.read() + " degrees Celsius");
            System.out.println("Temperature in helsiinkiVantaa Airport  " + helsinkiVantaaAirport.read() + " degrees Celsius");
            helsinkiVantaaAirport.setOff();
            System.out.println("temperature in helsiinkiVantaa Airport  " + helsinkiVantaaAirport.read() + " degrees Celsius"); // Throws exception as sensor is off
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        // Sets temperature to ON
        helsinkiVantaaAirport.setOn();
        Sensor kaisaniemi = new TemperatureSensor();

        // Creating new average sensor and adding sensors to it.
        AverageSensor helsinkiRegion = new AverageSensor("HelsinkiRegion");
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        kaisaniemi.setOff();
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        // On all the sensors in the HelsinkiRegion
        helsinkiRegion.setOn();

        // try catch block to catch exceptions
        try{

            System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
            System.out.println("readings: " + helsinkiRegion.readings());
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }


    }
}