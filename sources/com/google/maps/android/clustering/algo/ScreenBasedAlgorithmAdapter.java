package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class ScreenBasedAlgorithmAdapter<T extends ClusterItem> extends AbstractAlgorithm<T> implements ScreenBasedAlgorithm<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Algorithm f33771b;

    public ScreenBasedAlgorithmAdapter(Algorithm<T> algorithm) {
        this.f33771b = algorithm;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t10) {
        return this.f33771b.addItem(t10);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        return this.f33771b.addItems(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.f33771b.clearItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        return this.f33771b.getClusters(f10);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.f33771b.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.f33771b.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(CameraPosition cameraPosition) {
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t10) {
        return this.f33771b.removeItem(t10);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        return this.f33771b.removeItems(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i10) {
        this.f33771b.setMaxDistanceBetweenClusteredItems(i10);
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReclusterOnMapMovement() {
        return false;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t10) {
        return this.f33771b.updateItem(t10);
    }
}
