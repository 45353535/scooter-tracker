package com.google.maps.android.data;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes9.dex */
public class Point implements Geometry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLng f33929a;

    public Point(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.f33929a = latLng;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return "Point";
    }

    @NonNull
    public String toString() {
        return "Point{\n coordinates=" + this.f33929a + "\n}\n";
    }

    @Override // com.google.maps.android.data.Geometry
    public LatLng getGeometryObject() {
        return this.f33929a;
    }
}
