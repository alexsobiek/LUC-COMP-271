package CTA;

import java.util.ArrayList;
import java.util.Scanner;

public class CTAImplementation {
    public static void main(String[] args) {
        CTATrainRoute route = loadRedLineStops();
        System.out.println(route);
    }

    public static CTATrainRoute loadRedLineStops() {
        Scanner s = CTAUtilities.urlScanner("https://raw.githubusercontent.com/lgreco/DataStructures/master/data/RedLineSouthBound.txt");
        CTATrainRoute route = new CTATrainRoute();
        while (s.hasNextLine()) route.add(new CTAStation(s.nextLine()));
        return route;
    }

    public static void loadCityData() {
        ArrayList<CTAStation> stations = CTAUtilities.loadStations("https://data.cityofchicago.org/api/views/8pix-ypme/rows.csv?accessType=DOWNLOAD");
        for (CTAStation station : stations) {
            System.out.printf("%s : %f, %f\n", station.getName(), station.getLongitude(), station.getLatitude());
        }
    }
}
