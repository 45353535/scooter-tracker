package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.ClusterItem;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractAlgorithm<T extends ClusterItem> implements Algorithm<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f33750a = new ReentrantReadWriteLock();

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void lock() {
        this.f33750a.writeLock().lock();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void unlock() {
        this.f33750a.writeLock().unlock();
    }
}
