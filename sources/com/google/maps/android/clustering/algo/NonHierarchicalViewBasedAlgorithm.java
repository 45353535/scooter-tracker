package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class NonHierarchicalViewBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> implements ScreenBasedAlgorithm<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final SphericalMercatorProjection f33761i = new SphericalMercatorProjection(1.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LatLng f33764h;

    public NonHierarchicalViewBasedAlgorithm(int i10, int i11) {
        this.f33762f = i10;
        this.f33763g = i11;
    }

    private Bounds e(float f10) {
        LatLng latLng = this.f33764h;
        if (latLng == null) {
            return new Bounds(0.0d, 0.0d, 0.0d, 0.0d);
        }
        Point point = f33761i.toPoint(latLng);
        double d10 = f10;
        double dPow = ((((double) this.f33762f) / Math.pow(2.0d, d10)) / 256.0d) / 2.0d;
        double dPow2 = ((((double) this.f33763g) / Math.pow(2.0d, d10)) / 256.0d) / 2.0d;
        double d11 = point.f34025x;
        double d12 = point.f34026y;
        return new Bounds(d11 - dPow, d11 + dPow, d12 - dPow2, d12 + dPow2);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    protected Collection d(PointQuadTree pointQuadTree, float f10) {
        Bounds boundsE = e(f10);
        ArrayList arrayList = new ArrayList();
        double d10 = boundsE.minX;
        if (d10 < 0.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(d10 + 1.0d, 1.0d, boundsE.minY, boundsE.maxY)));
            boundsE = new Bounds(0.0d, boundsE.maxX, boundsE.minY, boundsE.maxY);
        }
        double d11 = boundsE.maxX;
        if (d11 > 1.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(0.0d, d11 - 1.0d, boundsE.minY, boundsE.maxY)));
            boundsE = new Bounds(boundsE.minX, 1.0d, boundsE.minY, boundsE.maxY);
        }
        arrayList.addAll(pointQuadTree.search(boundsE));
        return arrayList;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(CameraPosition cameraPosition) {
        this.f33764h = cameraPosition.target;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReclusterOnMapMovement() {
        return true;
    }

    public void updateViewSize(int i10, int i11) {
        this.f33762f = i10;
        this.f33763g = i11;
    }
}
