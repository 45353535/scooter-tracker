package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55580d;

    public e(boolean z10, boolean z11, String appForegroundUrl, String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f55577a = z10;
        this.f55578b = z11;
        this.f55579c = appForegroundUrl;
        this.f55580d = appBackgroundUrl;
    }

    public final String a() {
        return this.f55580d;
    }

    public final String b() {
        return this.f55579c;
    }

    public final boolean c() {
        return this.f55577a;
    }

    public final boolean d() {
        return this.f55578b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f55577a == eVar.f55577a && this.f55578b == eVar.f55578b && Intrinsics.areEqual(this.f55579c, eVar.f55579c) && Intrinsics.areEqual(this.f55580d, eVar.f55580d);
    }

    public int hashCode() {
        return (((((androidx.compose.foundation.c.a(this.f55577a) * 31) + androidx.compose.foundation.c.a(this.f55578b)) * 31) + this.f55579c.hashCode()) * 31) + this.f55580d.hashCode();
    }

    public String toString() {
        return "UserEventConfig(eventReportingEnabled=" + this.f55577a + ", userTrackingEnabled=" + this.f55578b + ", appForegroundUrl=" + this.f55579c + ", appBackgroundUrl=" + this.f55580d + ')';
    }
}
