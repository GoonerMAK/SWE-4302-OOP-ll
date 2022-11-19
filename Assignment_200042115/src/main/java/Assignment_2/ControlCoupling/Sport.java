package Assignment_2.ControlCoupling;


public class Sport {

    public void startPlaying()
    {
        String start = new Activity().CurrentActivity(true);
        System.out.println(start);
    }

    public void endPlaying()
    {
        String end = new Activity().CurrentActivity(false);
        System.out.println(end);
    }

}


