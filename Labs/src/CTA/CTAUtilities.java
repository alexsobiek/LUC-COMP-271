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
    public static Scanner fileScanner(String url) {
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
        ArrayList<CTAStation> station = new ArrayList<>();
        Scanner s = fileScanner(url);
        s.nextLine(); // Call nextLine() to skip over the CSV header
        while (s.hasNextLine()) {
            // Splits by all commas except those with trailing whitespace
            String[] entry = s.nextLine().split("(,(?=\\S))");
            float[] location = parseLocation(entry[16]); // Returns double[] with longitude and latitude
            station.add(new CTAStation(entry[3], location[0], location[1]));
        }
        return station;
    } // method loadStation;
}
