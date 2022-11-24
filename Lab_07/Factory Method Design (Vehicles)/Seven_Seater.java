package org.example;

public class Seven_Seater extends Vehicle implements IVehicle
{

    Seven_Seater(int distanceKM, int timeMinutes, int numberOfPassengers) {
        super(distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public int perHeadFare()
    {
        int fare;

        if (distanceKM < 10)
            fare = 300 / numberOfPassengers;
        else
            fare = distanceKM * 30 / numberOfPassengers;

        return fare - (fare % 5);
    }


    @Override
    public boolean canTakeTrip()
    {
        if (numberOfPassengers < 1)
            return false;

        return numberOfPassengers <= 7 && distanceKM >= 10;
    }
}
