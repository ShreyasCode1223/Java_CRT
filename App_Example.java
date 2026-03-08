import java.util.ArrayList;
import java.util.List;

abstract class Appliance 
{
    protected String name;
    protected double powerRating;

    public Appliance(String name, double powerRating) 
    {
        this.name = name;
        this.powerRating = powerRating;
    }

    public abstract double calculate(double hours);

    public String getName() {
        return name;
    }
}

class Fan extends Appliance {
    public Fan(String name, double powerRating) {
        super(name, powerRating);
    }

    @Override
    public double calculate(double hours) {
        return powerRating * hours;
    }
}

class AC extends Appliance {
    public AC(String name, double powerRating) {
        super(name, powerRating);
    }

    public double calculate(double hours) 
    {
        return powerRating * hours * 1.2;
    }
}

class Light extends Appliance 
{
    public Light(String name, double powerRating) 
    {
        super(name, powerRating);
    }

    public double calculate(double hours) 
    {
        return powerRating * hours * 0.8;
    }
}

public class App_Example {
    public static void main(String[] args) {
        List<Appliance> appliances = new ArrayList<>();

        appliances.add(new Fan("Fan", 75));
        appliances.add(new AC("AC", 1500));
        appliances.add(new Light("Light", 12));

        double usageHours = 5.0;

        for (Appliance app : appliances) {
            double consumption = app.calculate(usageHours);
            System.out.printf("%s: %.2f Wh\n", app.getName(), consumption);
        }
    }
}