package com.moloco.sdk.acm;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f54061d;

    public h(String appId, String postAnalyticsUrl, long j10, Map clientOptions) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        this.f54058a = appId;
        this.f54059b = postAnalyticsUrl;
        this.f54060c = j10;
        this.f54061d = clientOptions;
    }

    public final void a(long j10) {
        this.f54060c = j10;
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f54059b = str;
    }

    public final Map c() {
        return this.f54061d;
    }

    public final String d() {
        return this.f54059b;
    }

    public final long e() {
        return this.f54060c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f54058a, hVar.f54058a) && Intrinsics.areEqual(this.f54059b, hVar.f54059b) && this.f54060c == hVar.f54060c && Intrinsics.areEqual(this.f54061d, hVar.f54061d);
    }

    public int hashCode() {
        return (((((this.f54058a.hashCode() * 31) + this.f54059b.hashCode()) * 31) + androidx.collection.b.a(this.f54060c)) * 31) + this.f54061d.hashCode();
    }

    public String toString() {
        return "ACMConfig(appId=" + this.f54058a + ", postAnalyticsUrl=" + this.f54059b + ", requestPeriodSeconds=" + this.f54060c + ", clientOptions=" + this.f54061d + ')';
    }
}
