package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5619m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5616j f79032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5620n f79033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5617k f79034c;

    public C5619m(C5616j c5616j, C5620n c5620n, C5617k c5617k) {
        this.f79032a = c5616j;
        this.f79033b = c5620n;
        this.f79034c = c5617k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5619m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C5619m c5619m = (C5619m) obj;
        return Intrinsics.areEqual(this.f79032a, c5619m.f79032a) && Intrinsics.areEqual(this.f79033b, c5619m.f79033b) && Intrinsics.areEqual(this.f79034c, c5619m.f79034c);
    }

    public final int hashCode() {
        C5616j c5616j = this.f79032a;
        int iHashCode = (c5616j != null ? c5616j.hashCode() : 0) * 31;
        C5620n c5620n = this.f79033b;
        int iHashCode2 = (iHashCode + (c5620n != null ? c5620n.hashCode() : 0)) * 31;
        C5617k c5617k = this.f79034c;
        return iHashCode2 + (c5617k != null ? c5617k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f79032a + ", serviceCaptorConfig=" + this.f79033b + ", contentObserverCaptorConfig=" + this.f79034c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5619m(F f10) {
        C5631z c5631zA = f10.a();
        C5616j c5616j = c5631zA != null ? new C5616j(c5631zA) : null;
        H hC = f10.c();
        C5620n c5620n = hC != null ? new C5620n(hC) : null;
        B b10 = f10.b();
        this(c5616j, c5620n, b10 != null ? new C5617k(b10) : null);
    }
}
