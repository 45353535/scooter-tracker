package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public class TestClock implements Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f24614a;

    public TestClock(long j10) {
        this.f24614a = new AtomicLong(j10);
    }

    public void advance(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.f24614a.addAndGet(j10);
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.f24614a.get();
    }

    public void tick() {
        advance(1L);
    }
}
