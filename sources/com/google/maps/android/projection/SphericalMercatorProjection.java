package com.google.maps.android.projection;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes9.dex */
public class SphericalMercatorProjection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f34051a;

    public SphericalMercatorProjection(double d10) {
        this.f34051a = d10;
    }

    public LatLng toLatLng(com.google.maps.android.geometry.Point point) {
        double d10 = point.f34025x;
        double d11 = this.f34051a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (point.f34026y / d11))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d10 / d11) - 0.5d) * 360.0d);
    }

    public Point toPoint(LatLng latLng) {
        double d10 = (latLng.longitude / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d11 = this.f34051a;
        return new Point(d10 * d11, dLog * d11);
    }
}
