package com.google.firebase.installations.time;

/* JADX INFO: loaded from: classes9.dex */
public class SystemClock implements Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SystemClock f32926a;

    private SystemClock() {
    }

    public static SystemClock getInstance() {
        if (f32926a == null) {
            f32926a = new SystemClock();
        }
        return f32926a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
