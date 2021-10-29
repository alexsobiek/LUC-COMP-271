package CTA;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class CTAUtilities {
    /**
     * Creates a scanner object from contents of a webpage
     * @param url URL to grab contents from
     * @return Scanner
     */
    public static Scanner urlScanner(String url) {
        Scanner s = null;
        try {
            s = new Scanner(new URL(url).openStream());
        } catch (IOException e) {
            System.out.println(url + " is not a valid URL!");
            e.printStackTrace();
        }
        return s;
    } // method fileScanner

    /**
     * Takes in the formatted location and returns latitude and longitude
     * @param location String from CSV location
     * @return double[]
     */
    private static float[] parseLocation(String location) {
        String[] parts = location.replaceAll("[^\\d.,-]*", "").split(",");
        return new float[]{Float.parseFloat(parts[0]), Float.parseFloat(parts[1])};
    }

    /**
     * Loads all the stations from the provided CSV url to an ArrayList
     * @param url URL from data.cityofchicago.com
     * @return ArrayList
     */
    public static ArrayList<CTAStation> loadStations(String url) {
        ArrayList<String> stationNames = new ArrayList<>();
        ArrayList<CTAStation> station = new ArrayList<>();
        Scanner s = urlScanner(url);
        s.nextLine(); // Call nextLine() to skip over the CSV header
        while (s.hasNextLine()) {
            // Splits by all commas except those with trailing whitespace
            String[] entry = s.nextLine().split("(,(?=\\S))");
            float[] location = parseLocation(entry[16]); // Returns double[] with longitude and latitude
            if (!entry[3].equals("95th/Ran Ryan") && !stationNames.contains(entry[3])) {
                stationNames.add(entry[3]);
                station.add(new CTAStation(entry[3], location[0], location[1]));
            }
        }
        return station;
    } // method loadStation;

    /**
     * Compute Great Circle distance between two points on Earth.
     *
     * Usage:
     *
     *         double dist = distance(lat1, lon1, lat2, lon2)
     *                                ----------  ----------
     *                                     |           |
     *                                     |           Geographic coordinates
     *                                     |           of second point, in degrees
     *                                     |           of latitude and longitude.
     *                                     |
     *                                     Geographic coordinates
     *                                     of first point, in degrees
     *                                     of latitude and longitude.
     *
     * Based on the haversine formula (https://en.wikipedia.org/wiki/Haversine_formula):
     *
     * d = 2 * r * arcsin(sqrt(
     *                         hav(lat2-lat1) +
     *                         cos(lat1)*cos(lat2)*hav(lon2-lon1)
     *                         ))
     *
     * where hav is the haversine function, hav(x) = sin^2(x/2).
     *
     * The computed distance is subject to slight numerical errors because (a) the formula
     * assumes that Earth is a sphere, when it is not, and; (b) Math's toRadians is prone
     * to rounding errors.
     *
     * @param lat1 double Latitude of first point
     * @param lon1 double Longitude of first point
     * @param lat2 double Latitude of second point
     * @param lon2 double Longitude of second point
     * @return double distance between two points
     */
    public static double distance(double lat1, double lon1, double lat2, double lon2) {

        // Radius of earth, in miles. Use 6371 to compute in kilometers.
        final double EARTH_RADIUS = 3958.8;

        /*
        Convert latitudes to radians (the unit used by Math's trig functions). No such conversion
        is needed for the longitude values because they are not used individually in a trigonometric
        function. Instead, convert their different to radians to use in the second hav() function.
         */
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // Latitude difference for hav function (they are already in radians)
        double deltaLatitude = lat2-lat1;
        // Longitude difference for hav function (converted to radians)
        double deltaLongitude = Math.toRadians(lon2 - lon1);

        /*
        Build haversine formula step-by-step, for clarity. First compute the haversine functions
        for latitude and longitude using the substitution hav(x) = sin^2(x/2). Next, assemble the
        trig expression that goes the square root. And finally build the formula.
         */

        double latHav = Math.pow(Math.sin(deltaLatitude/2.0), 2.0);
        double lonHav = Math.pow(Math.sin(deltaLongitude/2.0), 2.0);
        double cosines = Math.cos(lat1)*Math.cos(lat2);
        double underRoot = latHav + cosines*lonHav;

        // Return value, assigned negative in case we fail to compute formula
        double d = -1.0;
        if (underRoot >= 0.0)
            d = 2 * EARTH_RADIUS * Math.asin(Math.sqrt(underRoot));
        return d;
    } // method distance

    /**
     * When distance is called with only a single set of coordinates, it uses the coordinates for Madison and
     * State.
     *
     * @param lat double latitude of location
     * @param lon double longitude of location
     * @return double Distance between the location passed and Madison & State
     */
    public static double distance(double lat, double lon) {
        return distance(lat, lon, 41.882067, -87.6283605);
    }
}
