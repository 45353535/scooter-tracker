package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5238l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f77642a;

    public C5238l4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f77642a.elapsedRealtime();
    }

    public C5238l4(SystemTimeProvider systemTimeProvider) {
        this.f77642a = systemTimeProvider;
    }
}
