package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class OnDemandCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f32098a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f32099b = new AtomicInteger();

    public int getDroppedOnDemandExceptions() {
        return this.f32099b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.f32098a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.f32099b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.f32098a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.f32099b.set(0);
    }
}
