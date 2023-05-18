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
        return isOn;
    }

    @Override
    public void setOn() {
        if(sensors.isEmpty()){
            throw new IllegalStateException("Sensor is empty");
        }
        for(Sensor sensor : sensors){
            sensor.setOn();
            isOn = true;
        }
    }

    @Override
    public void setOff() {
        if(sensors.isEmpty()){
            throw new IllegalStateException("Sensor is empty");
        }
        for(Sensor sensor : sensors){
            sensor.setOff();
            isOn = false;
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
        int avgerage = sum/ sensors.size();
        return avgerage;
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        int i =0;
        for (Sensor sensor : sensors) {
            readings.add(sensor.read());
            System.out.println("Temperature in " + getRegion() + " is " + readings.get(i));
            i++;
        }
        return readings;
    }

    public String getRegion() {
        return region;
    }
}