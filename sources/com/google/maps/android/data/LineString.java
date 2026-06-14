package com.google.maps.android.data;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class LineString implements Geometry<List<LatLng>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33926a;

    public LineString(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.f33926a = list;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return "LineString";
    }

    @NonNull
    public String toString() {
        return "LineString{\n coordinates=" + this.f33926a + "\n}\n";
    }

    @Override // com.google.maps.android.data.Geometry
    public List<LatLng> getGeometryObject() {
        return this.f33926a;
    }
}
