package com.appodeal.ads.networking;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14140i;

    public j(String sentryDsn, String sentryEnvironment, boolean z10, boolean z11, boolean z12, String breadcrumbs, int i10, boolean z13, long j10) {
        Intrinsics.checkNotNullParameter(sentryDsn, "sentryDsn");
        Intrinsics.checkNotNullParameter(sentryEnvironment, "sentryEnvironment");
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        this.f14132a = sentryDsn;
        this.f14133b = sentryEnvironment;
        this.f14134c = z10;
        this.f14135d = z11;
        this.f14136e = z12;
        this.f14137f = breadcrumbs;
        this.f14138g = i10;
        this.f14139h = z13;
        this.f14140i = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f14132a, jVar.f14132a) && Intrinsics.areEqual(this.f14133b, jVar.f14133b) && this.f14134c == jVar.f14134c && this.f14135d == jVar.f14135d && this.f14136e == jVar.f14136e && Intrinsics.areEqual(this.f14137f, jVar.f14137f) && this.f14138g == jVar.f14138g && this.f14139h == jVar.f14139h && this.f14140i == jVar.f14140i;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f14140i) + ((androidx.compose.foundation.c.a(this.f14139h) + ((this.f14138g + com.appodeal.ads.initializing.f.a(this.f14137f, (androidx.compose.foundation.c.a(this.f14136e) + ((androidx.compose.foundation.c.a(this.f14135d) + ((androidx.compose.foundation.c.a(this.f14134c) + com.appodeal.ads.initializing.f.a(this.f14133b, this.f14132a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SentryAnalyticConfig(sentryDsn=" + this.f14132a + ", sentryEnvironment=" + this.f14133b + ", sentryCollectThreads=" + this.f14134c + ", isSentryTrackingEnabled=" + this.f14135d + ", isAttachViewHierarchy=" + this.f14136e + ", breadcrumbs=" + this.f14137f + ", maxBreadcrumbs=" + this.f14138g + ", isInternalEventTrackingEnabled=" + this.f14139h + ", initTimeoutMs=" + this.f14140i + ")";
    }
}
