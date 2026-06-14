package com.moloco.sdk.acm.services;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f54112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f54113b;

    public e(f timeProviderService) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f54112a = timeProviderService;
        this.f54113b = new AtomicLong(0L);
    }

    public final long a() {
        return this.f54112a.invoke() - this.f54113b.get();
    }

    public final void b() {
        this.f54113b.set(this.f54112a.invoke());
    }
}
