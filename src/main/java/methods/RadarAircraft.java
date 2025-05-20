package methods;

public class RadarAircraft {
    private String callSign;
    private int altitudeFL;
    private int rateClimbDescent;
    private int speedKmh;
    private int remainingFuel;

    RadarAircraft(String callSign,
                  int altitudeFL,
                  int rateClimbDescent,
                  int speedKmh,
                  int remainingFuel) {
        this.callSign = callSign;
        this.altitudeFL = altitudeFL;
        this.rateClimbDescent = rateClimbDescent;
        this.speedKmh = speedKmh;
        this.remainingFuel = remainingFuel;
    }

    public int calculateRange(int fuelConsumptionLitresPerHour)
        throws ArithmeticException {
        int flightHours = remainingFuel / fuelConsumptionLitresPerHour;

        fuelConsumptionLitresPerHour = 0;

        return flightHours * speedKmh;
    }
}
