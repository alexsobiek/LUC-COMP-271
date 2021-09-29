package CTA;

/**
 * Class for CTA train stations. The class inherits fields and methods from CTALocation and captures state
 * and behavior specific to train stations.
 */
public class CTAStation extends CTALocation {

    private int stopId;

    /** Is there an elevator at the station? */
    private boolean hasElevator;

    /** Is there an escalator at the station? */
    private boolean hasEscalator;

    /** Is the station accessible for people with disabilities? */
    private boolean isAccessible;

    /**
     * Basic constructor. It assigns a name to a location and sets up a hashtag for it as well.
     *
     * @param name      String with name of a location.
     * @param longitude
     * @param latitude
     */
    public CTAStation(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }
}
