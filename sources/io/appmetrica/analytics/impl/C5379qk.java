package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5379qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f78090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78091b;

    public C5379qk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f78090a = systemTimeProvider;
        this.f78091b = systemTimeProvider.currentTimeMillis();
    }
}
