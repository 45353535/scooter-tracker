package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.Point;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonPoint extends Point {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f33976b;

    public GeoJsonPoint(LatLng latLng) {
        this(latLng, null);
    }

    public Double getAltitude() {
        return this.f33976b;
    }

    public LatLng getCoordinates() {
        return getGeometryObject();
    }

    public String getType() {
        return getGeometryType();
    }

    public GeoJsonPoint(LatLng latLng, Double d10) {
        super(latLng);
        this.f33976b = d10;
    }
}
