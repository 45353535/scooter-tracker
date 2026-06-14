package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.LineString;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonLineString extends LineString {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33971b;

    public GeoJsonLineString(List<LatLng> list) {
        this(list, null);
    }

    public List<Double> getAltitudes() {
        return this.f33971b;
    }

    public List<LatLng> getCoordinates() {
        return getGeometryObject();
    }

    public String getType() {
        return getGeometryType();
    }

    public GeoJsonLineString(List<LatLng> list, List<Double> list2) {
        super(list);
        this.f33971b = list2;
    }
}
