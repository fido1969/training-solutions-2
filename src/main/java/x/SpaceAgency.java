package x;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    List<Satellite> satellites = new ArrayList<>();

    public List<Satellite> getSatellites() {
        return satellites;
    }

    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite satellite : satellites) {
            if (registerIdent.equals(satellite.getRegisterIdent())) {
                return satellite;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }

    @Override
    public String toString() {
        return satellites.toString();
    }
}
