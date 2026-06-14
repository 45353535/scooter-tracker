package com.moloco.sdk.acm;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f53989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f53990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f53991e;

    public e(String appId, String postAnalyticsUrl, Context context, long j10, Map clientOptions) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        this.f53987a = appId;
        this.f53988b = postAnalyticsUrl;
        this.f53989c = context;
        this.f53990d = j10;
        this.f53991e = clientOptions;
    }

    public final String a() {
        return this.f53987a;
    }

    public final Map b() {
        return this.f53991e;
    }

    public final Context c() {
        return this.f53989c;
    }

    public final String d() {
        return this.f53988b;
    }

    public final long e() {
        return this.f53990d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f53987a, eVar.f53987a) && Intrinsics.areEqual(this.f53988b, eVar.f53988b) && Intrinsics.areEqual(this.f53989c, eVar.f53989c) && this.f53990d == eVar.f53990d && Intrinsics.areEqual(this.f53991e, eVar.f53991e);
    }

    public int hashCode() {
        return (((((((this.f53987a.hashCode() * 31) + this.f53988b.hashCode()) * 31) + this.f53989c.hashCode()) * 31) + androidx.collection.b.a(this.f53990d)) * 31) + this.f53991e.hashCode();
    }

    public String toString() {
        return "InitConfig(appId=" + this.f53987a + ", postAnalyticsUrl=" + this.f53988b + ", context=" + this.f53989c + ", requestPeriodSeconds=" + this.f53990d + ", clientOptions=" + this.f53991e + ')';
    }
}
