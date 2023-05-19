package application;

import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    public boolean isOn;
    public List<Sensor> sensors;
    public List<Integer> readings;
    private String region;

    public AverageSensor(String region) {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
        this.region = region;
    }
    @Override
    public boolean isOn() {

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;

    }

    @Override
    public void setOn() {
        try{
        if(sensors.isEmpty()){
            throw new IllegalStateException("Sensor is empty");
        }
        for(Sensor sensor : sensors){
            sensor.setOn();
            isOn = true;
        }}
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void setOff() {
        try{
        if(sensors.isEmpty()){
            throw new IllegalStateException("Sensor is empty");
        }
        for(Sensor sensor : sensors){
            sensor.setOff();
            isOn = false;
        }}
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int read() {
        if (isOn== false || sensors.isEmpty()){
            throw new IllegalStateException("Sensor is off or there are no sensors added in Average Sensor.");
        }
        int sum =0;

        for (Sensor sensor : sensors){
            // System.out.println("here");

            sum += sensor.read();


        }
//      System.out.println("Sum" + sum);
//       System.out.println("Size" +sensors.size());
        return sum/ sensors.size();
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        if(sensors.isEmpty()){
            System.out.println("No sensors added. No readings to display");
        }
        int i =0;
        for (Sensor sensor : sensors) {
            readings.add(sensor.read());
            System.out.println("Temperature in " + getRegion() + i + " is " + readings.get(i));
            i++;
        }
        return readings;
    }

    public String getRegion() {
        return region;
    }
}