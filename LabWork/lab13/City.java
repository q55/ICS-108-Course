package lab13;

public class City implements Comparable<City>, Cloneable {
    private String cityName;
    private int temperature;

    public City(String cityName, int temperature){
        this.cityName = cityName;
        this.temperature = temperature;
    }


    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @Override
    public int compareTo(City o){
        if(this.temperature > o.temperature){
            return 1;
        }
        else if (this.temperature < o.temperature) {
            return -1;
        }
        else{
            return 0 ; 
        }
    }
    public String toString(){
        return "City.name: " + getCityName() + "\n" +
                "temperature: " + getTemperature();
    }
}