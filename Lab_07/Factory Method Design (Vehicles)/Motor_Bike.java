package org.example;

public class Motor_Bike extends Vehicle implements IVehicle
{

    Motor_Bike(int distanceKM, int timeMinutes, int numberOfPassengers) {
        super(distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public int perHeadFare()
    {
        return Math.max(25, distanceKM * 20) / numberOfPassengers;
    }

    @Override
    public boolean canTakeTrip()
    {
        if (numberOfPassengers < 1)
            return false;

        return numberOfPassengers <= 1 && distanceKM <= 10;
    }
}
