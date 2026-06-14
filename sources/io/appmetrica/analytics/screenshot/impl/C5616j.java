package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5616j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79019a;

    public C5616j(boolean z10) {
        this.f79019a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5616j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f79019a == ((C5616j) obj).f79019a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f79019a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f79019a + ')';
    }

    public C5616j(C5631z c5631z) {
        this(c5631z.a());
    }
}
