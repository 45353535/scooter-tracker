package com.google.maps.android.heatmaps;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;

/* JADX INFO: loaded from: classes9.dex */
public class WeightedLatLng implements PointQuadTree.Item {
    public static final double DEFAULT_INTENSITY = 1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SphericalMercatorProjection f34048c = new SphericalMercatorProjection(1.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Point f34049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f34050b;

    public WeightedLatLng(LatLng latLng, double d10) {
        this.f34049a = f34048c.toPoint(latLng);
        if (d10 >= 0.0d) {
            this.f34050b = d10;
        } else {
            this.f34050b = 1.0d;
        }
    }

    public double getIntensity() {
        return this.f34050b;
    }

    @Override // com.google.maps.android.quadtree.PointQuadTree.Item
    public Point getPoint() {
        return this.f34049a;
    }

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
