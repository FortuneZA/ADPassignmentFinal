package za.ac.cput.ADPassignmentFinal;

public class Vehicle {

    private String sedan;
    private String suv;

    public Vehicle(){}

    public Vehicle(String sedan, String suv) {
        this.sedan = sedan;
        this.suv = suv;
    }

    public String getSedan() {
        return sedan;
    }

    public void setSedan(String sedan) {
        this.sedan = sedan;
    }

    public String getSuv() {
        return suv;
    }

    public void setSuv(String suv) {
        this.suv = suv;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "sedan='" + sedan + '\'' + ", suv='" + suv + '\'' + '}';
    }
}