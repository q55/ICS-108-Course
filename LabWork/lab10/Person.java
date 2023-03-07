public class Person {
    private String name;
    private int phone_number;

    public Person(String name,int phone_number){
        this.name = name;
        this.phone_number = phone_number;

    }
    public String getName(){
        return name;
    }

    public int getPhoneNumber(){
        return phone_number;
    }

    public void setPhoneNumber(int phone_number){
        this.phone_number = phone_number;
    }

    public String toString(){
        return "Name: " +name +", Phone number: "+phone_number;
    }



}
