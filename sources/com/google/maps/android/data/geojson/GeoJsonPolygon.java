package com.google.maps.android.data.geojson;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.DataPolygon;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonPolygon implements DataPolygon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33978a;

    public GeoJsonPolygon(List<? extends List<LatLng>> list) {
        if (list == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.f33978a = list;
    }

    public List<? extends List<LatLng>> getCoordinates() {
        return this.f33978a;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return getType();
    }

    public String getType() {
        return KmlPolygon.GEOMETRY_TYPE;
    }

    @NonNull
    public String toString() {
        return KmlPolygon.GEOMETRY_TYPE + "{\n coordinates=" + this.f33978a + "\n}\n";
    }

    @Override // com.google.maps.android.data.Geometry
    public List<? extends List<LatLng>> getGeometryObject() {
        return getCoordinates();
    }

    @Override // com.google.maps.android.data.DataPolygon
    public ArrayList<ArrayList<LatLng>> getInnerBoundaryCoordinates() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i10 = 1; i10 < getCoordinates().size(); i10++) {
            arrayList.add((ArrayList) getCoordinates().get(i10));
        }
        return arrayList;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public ArrayList<LatLng> getOuterBoundaryCoordinates() {
        return (ArrayList) getCoordinates().get(0);
    }
}
