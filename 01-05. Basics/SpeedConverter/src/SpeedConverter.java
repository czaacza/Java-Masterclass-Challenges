public class SpeedConverter {
    public static double toKilometerPerHour(double milesPerHour){
        if(milesPerHour > 0 )
            return ( Math.round(milesPerHour * 1.609344));
        return -1;
    }
    public static double toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour > 0)
            return (Math.round(kilometersPerHour / 1.609344));
        return -1;
    }
    public static void printConversion(double value){
        System.out.println(value);
    }
}
