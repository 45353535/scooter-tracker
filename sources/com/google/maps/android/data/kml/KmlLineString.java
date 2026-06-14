package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.LineString;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class KmlLineString extends LineString {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f33992b;

    public KmlLineString(ArrayList<LatLng> arrayList) {
        this(arrayList, null);
    }

    public ArrayList<Double> getAltitudes() {
        return this.f33992b;
    }

    public KmlLineString(ArrayList<LatLng> arrayList, ArrayList<Double> arrayList2) {
        super(arrayList);
        this.f33992b = arrayList2;
    }

    @Override // com.google.maps.android.data.LineString, com.google.maps.android.data.Geometry
    public List<LatLng> getGeometryObject() {
        return new ArrayList(super.getGeometryObject());
    }
}
