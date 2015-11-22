package com.clionelabs.flirhackathon;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Payload {
    public final Double latitude;
    public final Double longitude;
    public final Double altitude;
    public final Integer width = 40;
    public final Integer height = 30;
    public final List heat;
    public Payload(Double latitude, Double longitude, Double altitudeInM, ArrayList<Double> imageGray) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitudeInM;
        this.heat = imageGray;
    }
}
