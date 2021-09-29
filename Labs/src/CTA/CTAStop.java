package CTA;

/**
 * Class for CTA bus stops. The class inherits fields and methods from CTALocation and captures state
 * and behavior specific to bus stops.
 */
public class CTAStop extends CTALocation {

    /** Does the stop have a canopy/shelter? */
    private boolean hasShelter;

    /** What is the stop's SMS number for bus arrival info? */
    private String smsInfo;

    /**
     * Basic constructor. It assigns a name to a location and sets up a hashtag for it as well.
     *
     * @param name      String with name of a location.
     * @param longitude
     * @param latitude
     */
    public CTAStop(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }
}
