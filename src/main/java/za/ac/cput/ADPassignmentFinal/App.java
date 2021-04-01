package za.ac.cput.ADPassignmentFinal;


/**
 * Author: Mathew Fortuin - 219069514
 *Main class: Small domain that stores information
 */
public class App
{

    private String name;
    private long id;

    //Getters

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }


    //Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args )
    {
        App run = new App();
        run.toString();
    }
}
