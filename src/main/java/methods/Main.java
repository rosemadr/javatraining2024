package methods;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        RadarAircraft ro123 = new RadarAircraft(
                "RO123",
                280,
                20,
                895,
                20000);

        int fuelConsumptionLitresPerHour = 2000;
        int ro123Range = ro123.calculateRange(fuelConsumptionLitresPerHour);

        out.println("Range is " + ro123Range + " km");
        out.println(fuelConsumptionLitresPerHour);
    }
}
