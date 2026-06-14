package com.google.maps.android.clustering.algo;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public class StaticCluster<T extends ClusterItem> implements Cluster<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLng f33772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f33773b = new LinkedHashSet();

    public StaticCluster(LatLng latLng) {
        this.f33772a = latLng;
    }

    public boolean add(T t10) {
        return this.f33773b.add(t10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StaticCluster)) {
            return false;
        }
        StaticCluster staticCluster = (StaticCluster) obj;
        return staticCluster.f33772a.equals(this.f33772a) && staticCluster.f33773b.equals(this.f33773b);
    }

    @Override // com.google.maps.android.clustering.Cluster
    public Collection<T> getItems() {
        return this.f33773b;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public LatLng getPosition() {
        return this.f33772a;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public int getSize() {
        return this.f33773b.size();
    }

    public int hashCode() {
        return this.f33772a.hashCode() + this.f33773b.hashCode();
    }

    public boolean remove(T t10) {
        return this.f33773b.remove(t10);
    }

    @NonNull
    public String toString() {
        return "StaticCluster{mCenter=" + this.f33772a + ", mItems.size=" + this.f33773b.size() + '}';
    }
}
