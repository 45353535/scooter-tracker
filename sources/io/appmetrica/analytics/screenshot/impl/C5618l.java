package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5618l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5619m f79029b;

    public C5618l(boolean z10, C5619m c5619m) {
        this.f79028a = z10;
        this.f79029b = c5619m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5618l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C5618l c5618l = (C5618l) obj;
        return this.f79028a == c5618l.f79028a && Intrinsics.areEqual(this.f79029b, c5618l.f79029b);
    }

    public final int hashCode() {
        int iA = androidx.compose.foundation.c.a(this.f79028a) * 31;
        C5619m c5619m = this.f79029b;
        return iA + (c5619m != null ? c5619m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f79028a + ", config=" + this.f79029b + ')';
    }
}
