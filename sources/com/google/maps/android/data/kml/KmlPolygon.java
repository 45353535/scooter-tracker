package com.google.maps.android.data.kml;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.DataPolygon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class KmlPolygon implements DataPolygon<ArrayList<ArrayList<LatLng>>> {
    public static final String GEOMETRY_TYPE = "Polygon";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f34003b;

    public KmlPolygon(List<LatLng> list, List<List<LatLng>> list2) {
        if (list == null) {
            throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
        }
        this.f34002a = list;
        this.f34003b = list2;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public List<List<LatLng>> getInnerBoundaryCoordinates() {
        return this.f34003b;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public List<LatLng> getOuterBoundaryCoordinates() {
        return this.f34002a;
    }

    @NonNull
    public String toString() {
        return GEOMETRY_TYPE + "{\n outer coordinates=" + this.f34002a + ",\n inner coordinates=" + this.f34003b + "\n}\n";
    }

    @Override // com.google.maps.android.data.Geometry
    public List<List<LatLng>> getGeometryObject() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f34002a);
        List list = this.f34003b;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
