package com.google.maps.android.clustering.algo;

import androidx.collection.LruCache;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Algorithm f33765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LruCache f33766c = new LruCache(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReadWriteLock f33767d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f33768e = Executors.newCachedThreadPool();

    private class PrecacheRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f33769b;

        public PrecacheRunnable(int i10) {
            this.f33769b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.c(this.f33769b);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.f33765b = algorithm;
    }

    private void b() {
        this.f33766c.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set c(int i10) {
        this.f33767d.readLock().lock();
        Set<? extends Cluster<T>> clusters = (Set) this.f33766c.get(Integer.valueOf(i10));
        this.f33767d.readLock().unlock();
        if (clusters == null) {
            this.f33767d.writeLock().lock();
            clusters = (Set) this.f33766c.get(Integer.valueOf(i10));
            if (clusters == null) {
                clusters = this.f33765b.getClusters(i10);
                this.f33766c.put(Integer.valueOf(i10), clusters);
            }
            this.f33767d.writeLock().unlock();
        }
        return clusters;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t10) {
        boolean zAddItem = this.f33765b.addItem(t10);
        if (zAddItem) {
            b();
        }
        return zAddItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        boolean zAddItems = this.f33765b.addItems(collection);
        if (zAddItems) {
            b();
        }
        return zAddItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.f33765b.clearItems();
        b();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        int i10 = (int) f10;
        Set<? extends Cluster<T>> setC = c(i10);
        int i11 = i10 + 1;
        if (this.f33766c.get(Integer.valueOf(i11)) == null) {
            this.f33768e.execute(new PrecacheRunnable(i11));
        }
        int i12 = i10 - 1;
        if (this.f33766c.get(Integer.valueOf(i12)) == null) {
            this.f33768e.execute(new PrecacheRunnable(i12));
        }
        return setC;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.f33765b.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.f33765b.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t10) {
        boolean zRemoveItem = this.f33765b.removeItem(t10);
        if (zRemoveItem) {
            b();
        }
        return zRemoveItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean zRemoveItems = this.f33765b.removeItems(collection);
        if (zRemoveItems) {
            b();
        }
        return zRemoveItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i10) {
        this.f33765b.setMaxDistanceBetweenClusteredItems(i10);
        b();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t10) {
        boolean zUpdateItem = this.f33765b.updateItem(t10);
        if (zUpdateItem) {
            b();
        }
        return zUpdateItem;
    }
}
