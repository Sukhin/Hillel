package project_part3;

public class Car {

    public void star() {

        startElectricity();
        startCommand();
        startFuelSystem();

    }

    private void startElectricity() {

        System.out.println("The \"Start Electricity\" method!");

    }

    private void startCommand() {

        System.out.println("The \"Start Command\" method!");

    }

    private void startFuelSystem() {

        System.out.println("The \"Start Fuel System\" method!");

    }

}
