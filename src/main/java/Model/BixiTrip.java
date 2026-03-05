package Model;

public class BixiTrip {
    private final int startStation; //use a dictionary to convert string to an ID
    private final int startArrondissement;

    private final int endStation;
    private final int endArrondissement;

    private final int startTimeMin;
    private final int endTimeMin;

    public BixiTrip(int startStation, int startArrondissement, int endStation, int endArrondissement, int startTimeMin, int endTimeMin) {
        this.startStation = startStation;
        this.startArrondissement = startArrondissement;
        this.endStation = endStation;
        this.endArrondissement = endArrondissement;
        this.startTimeMin = startTimeMin;
        this.endTimeMin = endTimeMin;
    }

    public int durationMin() {return endTimeMin - startTimeMin;}

    public int getHour() {return startTimeMin % 24}

    //Something is wrong with how I plan to implement time, UNIX timestamp gives the amount of time since January 1st 1970
    //

}