package org.example;

enum VehicleTypes {
    SEDAN, MOTOR_BIKE, SEVEN_SEATER
}

public class Trip
{
   private IVehicle vehicle;

    public Trip(VehicleTypes type, int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.vehicle = chooseVehicle(type,distanceKM, timeMinutes, numberOfPassengers);     // The factory method in use
    }

    public int perHeadFare()
    {
        return vehicle.perHeadFare();
    }

    public boolean canTakeTrip() { return vehicle.canTakeTrip(); }



                                    /*  The Factory Method  */
    public IVehicle chooseVehicle(VehicleTypes type, int distanceKM, int timeMinutes, int numberOfPassengers)
    {

        if (type.equals(VehicleTypes.SEDAN))
        {
            return new Sedan(distanceKM, timeMinutes, numberOfPassengers);
        }

        else if (type.equals(VehicleTypes.MOTOR_BIKE))
        {
            return new Motor_Bike(distanceKM, timeMinutes, numberOfPassengers);
        }

        else if(type.equals(VehicleTypes.SEVEN_SEATER))
        {
            return new Seven_Seater(distanceKM, timeMinutes, numberOfPassengers);
        }

        else
        {
            throw new IllegalArgumentException("Invalid.... ");
        }

    }

    

    public static void main(String[] args)
    {
        Trip trip = new Trip(VehicleTypes.SEDAN, 10, 30, 3);
        System.out.println(trip.canTakeTrip());
        System.out.println(trip.perHeadFare());

    }


}
