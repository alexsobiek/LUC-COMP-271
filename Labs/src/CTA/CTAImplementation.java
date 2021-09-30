package CTA;

import java.util.ArrayList;

public class CTAImplementation {
    public static void main(String[] args) {
        ArrayList<CTAStation> stations = CTAUtilities.loadStations("https://data.cityofchicago.org/api/views/8pix-ypme/rows.csv?accessType=DOWNLOAD");
        for (CTAStation station : stations) {
            System.out.printf("%s : %f, %f\n", station.getName(), station.getLongitude(), station.getLatitude());
        }
    }
}
