package Assignment_2.ControlCoupling;


// Example of controlled coupling

public class Activity {

    public String CurrentActivity(boolean startPlay) {

        if (startPlay)
        { return "Playing..."; }

        else
        { return "Stopped playing..."; }

    }


    // Activity is control-coupled to Sport since Sport controls the
    // internal logic of the boolean value which is passed as a parameter in CurrentActivity method

    public static void main(String[] args)
    {
        Sport s = new Sport();

        s.startPlaying();
        s.endPlaying();
    }


}
