package lab13.Version2;

public class City implements Comparable<City>, Cloneable {

    private String cityName;
    private int temperature;

    public City(String cityName,int temperature){
        this.cityName =cityName;
        this.temperature = temperature;
    }

    public int compareTo(City city){
        if (this.temperature > city.temperature){
            return 1;
        }
        else if (this.temperature < city.temperature) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public int getTemperature(){
        return temperature;
    }
    public String getCityName(){
        return cityName;
    }

    //important ****
    public boolean equals(Object o) {
        if (o instanceof City) {
            City oToCity = (City) o;
            return this.temperature == oToCity.getTemperature() && this.cityName.equals(oToCity.cityName);
        }
        return false;
    }

    @Override
    public City clone(){
        try{ return (City) super.clone();}
        catch (CloneNotSupportedException ex) {return null;}
    }

    @Override
    public String toString() {
        return "City.name: " + getCityName() + "\n" +
                "temperature: " + getTemperature();
    }
}