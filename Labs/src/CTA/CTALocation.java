package CTA;

/**
 * A superclass for CTA locations. CTA locations are either bus stops or train stations. This superclass
 * captures the common characteristics of these two types of locations: all locations have a name, an address,
 * and a hashtag. The different characteristics (for example, stations may have elevators, bus stops don't)
 * are delegated to two classes that extend this class.
 */
public class CTALocation implements Comparable<CTALocation> {

    private int mapId;

    private static final String NOT_AVAILABLE_MESSAGE = "Information not available";

    /** The name of the location, e.g., "95th Street" */
    private final String name;

    /** The address of the location, e.g. "15 West 95th Street". Eventually we need an Address object here. */
    private String address;

    private final float longitude;

    private final float latitude;

    /** Hashtag for social media use */
    private String hashTag;

    /**
     * Basic constructor. It assigns a name to a location and sets up a hashtag for it as well.
     *
     * @param name String with name of a location.
     */
    public CTALocation(String name, float longitude, float latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = NOT_AVAILABLE_MESSAGE;
        this.hashTag = "#" + name.toLowerCase();
    } // constructor CTALocation

    /**
     * Returns the name of this station
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the latitude of this stations location
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Returns the longitude of this stations location
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Calculates the distance from 41.881866, -87.6298057 (Downtown Chicago)
     * @param latitude Latitude
     * @param longitude Longitude
     * @return double
     */
    private double distanceFromDowntown(double latitude, double longitude) {
        return Math.sqrt((Math.pow(longitude + 87.6298057, 2)) + Math.pow(latitude - 41.881866, 2));
    }

    /**
     * Compares this CTALocation to the provided CTALocation
     * @param other CTALocation to compare to
     * @return Integer
     */
    @Override
    public int compareTo(CTALocation other) {
        double d1 = distanceFromDowntown(this.latitude, this.longitude);
        double d2 = distanceFromDowntown(other.latitude, other.longitude);
        return ((int) d2 - (int) d1);
    }
} // class CTALocation
