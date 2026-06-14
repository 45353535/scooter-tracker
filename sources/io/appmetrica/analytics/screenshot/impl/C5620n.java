package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5620n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79036b;

    public C5620n(boolean z10, long j10) {
        this.f79035a = z10;
        this.f79036b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5620n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C5620n c5620n = (C5620n) obj;
        return this.f79035a == c5620n.f79035a && this.f79036b == c5620n.f79036b;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f79036b) + (androidx.compose.foundation.c.a(this.f79035a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f79035a + ", delaySeconds=" + this.f79036b + ')';
    }

    public C5620n(H h10) {
        this(h10.b(), h10.a());
    }
}
