package com.google.maps.android.clustering.algo;

import androidx.collection.LongSparseArray;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33751b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f33752c = DesugarCollections.synchronizedSet(new HashSet());

    private static long a(long j10, double d10, double d11) {
        return (long) ((j10 * Math.floor(d10)) + Math.floor(d11));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t10) {
        return this.f33752c.add(t10);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        return this.f33752c.addAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.f33752c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        long j10;
        long jCeil = (long) Math.ceil((Math.pow(2.0d, f10) * 256.0d) / ((double) this.f33751b));
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(jCeil);
        HashSet hashSet = new HashSet();
        LongSparseArray longSparseArray = new LongSparseArray();
        synchronized (this.f33752c) {
            try {
                for (ClusterItem clusterItem : this.f33752c) {
                    Point point = sphericalMercatorProjection.toPoint(clusterItem.getPosition());
                    long jA = a(jCeil, point.f34025x, point.f34026y);
                    StaticCluster staticCluster = (StaticCluster) longSparseArray.get(jA);
                    if (staticCluster == 0) {
                        j10 = jCeil;
                        staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(Math.floor(point.f34025x) + 0.5d, Math.floor(point.f34026y) + 0.5d)));
                        longSparseArray.put(jA, staticCluster);
                        hashSet.add(staticCluster);
                    } else {
                        j10 = jCeil;
                    }
                    staticCluster.add(clusterItem);
                    jCeil = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.f33752c;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.f33751b;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t10) {
        return this.f33752c.remove(t10);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        return this.f33752c.removeAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i10) {
        this.f33751b = i10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t10) {
        boolean zRemoveItem;
        synchronized (this.f33752c) {
            try {
                zRemoveItem = removeItem(t10);
                if (zRemoveItem) {
                    zRemoveItem = addItem(t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemoveItem;
    }
}
