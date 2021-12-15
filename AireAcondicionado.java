
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
    // instance variables - replace the example below with your own
    private double temperatura;

    /**
     * Constructor for objects of class AireAcondicionado
     */
    public AireAcondicionado()
    {
        // initialise instance variables
        temperatura = 15.0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void subirTemperatura()
    {
        // put your code here
        temperatura = temperatura + 5;
    }
    public void bajarTemperatura() {
        temperatura = temperatura - 5;
    }
    public double getTemperatura() {
        return temperatura;
    }
}
