package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.Point;

/* JADX INFO: loaded from: classes9.dex */
public class KmlPoint extends Point {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f34001b;

    public KmlPoint(LatLng latLng) {
        this(latLng, null);
    }

    public Double getAltitude() {
        return this.f34001b;
    }

    public KmlPoint(LatLng latLng, Double d10) {
        super(latLng);
        this.f34001b = d10;
    }
}
