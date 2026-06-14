package com.moloco.sdk.internal.configs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54208b;

    public a(String reportingUrl, int i10) {
        Intrinsics.checkNotNullParameter(reportingUrl, "reportingUrl");
        this.f54207a = reportingUrl;
        this.f54208b = i10;
    }

    public final int a() {
        return this.f54208b;
    }

    public final String b() {
        return this.f54207a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f54207a, aVar.f54207a) && this.f54208b == aVar.f54208b;
    }

    public int hashCode() {
        return (this.f54207a.hashCode() * 31) + this.f54208b;
    }

    public String toString() {
        return "OperationalMetricsConfig(reportingUrl=" + this.f54207a + ", pollingIntervalSeconds=" + this.f54208b + ')';
    }
}
