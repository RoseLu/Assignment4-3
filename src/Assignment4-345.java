/**
 * Created by Kevin on 2/6/2017.
 */

class GasTank {

    private double amount = 0;

    public double maxamount = 50;

    public void addGas(double amount) {
        this.amount += amount;
    }

    public void useGas(double amount) {
        this.amount -= amount;
    }

    public double getGasLevel() {
        return amount;
    }

    public GasTank(double gas) {
        addGas(gas);
    }
}

class Car {

    GasTank gt = new GasTank(50);

    private String model;

    private double miles = 0;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void addMiles(double miles) {
        this.miles += miles;
    }

    public double getMiles() {
        return miles;
    }

    public Car(String model) {

        setModel(model);

    }

    public void running(double miles) {
        addMiles(miles);
        gt.useGas(miles * 0.5);
    }

    public void addGas(double gas) {
        gt.addGas(gas);
    }

    public double checkGas() {
        return gt.getGasLevel();
    }

    public boolean isrunning(double miles) {
        if (gt.getGasLevel() < (miles * 0.5)) {
            System.out.println("Sry, the left gas can't be used for driving this far. Only " + (gt.getGasLevel() * 2) + " miles left.");
            return false;
        } else {
            return true;
        }
    }

    public boolean isaddGas(double gas) {
        if ((gt.getGasLevel() + gas) > gt.maxamount) {
            System.out.println("Sry, it's out of the maximum of gastank. You can only add " + (gt.maxamount - gt.getGasLevel()) + " L more.");
            return false;
        } else {
            return true;
        }
    }
}

class Driver {

    Car c;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Driver(String name, String model) {
        setName(name);
        c = new Car(model);
    }

    public void drive(double miles) {
        if (c.isrunning(miles)) {
            c.running(miles);
            System.out.println(getName() + " drove his " + c.getModel() + " for about " + miles + " miles.");
        }
    }

    public void addGas(double gas) {
        if (c.isaddGas(gas)) {
            c.addGas(gas);
            System.out.println(getName() + " got " + gas + " L gas for " + c.getModel() + ". There are totally " + c.checkGas() + " L gas in this car.");
        }
    }

    public void checkcar() {
        System.out.println("This " + c.getModel() + " belongs to " + getName() + ".");
        System.out.println("This car has run for " + c.getMiles() + " miles.");
        System.out.println("There are " + c.checkGas() + " L gas left. And it can be used for " + (c.checkGas() * 2) + " miles.");
    }
}