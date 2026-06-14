package com.moloco.sdk.acm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f54057b;

    public g(String str, Long l10) {
        this.f54056a = str;
        this.f54057b = l10;
    }

    public final String a() {
        return this.f54056a;
    }

    public final Long b() {
        return this.f54057b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f54056a, gVar.f54056a) && Intrinsics.areEqual(this.f54057b, gVar.f54057b);
    }

    public int hashCode() {
        String str = this.f54056a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f54057b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "UpdateConfig(postAnalyticsUrl=" + this.f54056a + ", requestPeriodSeconds=" + this.f54057b + ')';
    }
}
