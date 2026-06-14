package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f75750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f75752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f75753f;

    public F0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i10, String str3, String str4) {
        this.f75748a = str;
        this.f75749b = str2;
        this.f75750c = counterConfigurationReporterType;
        this.f75751d = i10;
        this.f75752e = str3;
        this.f75753f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return Intrinsics.areEqual(this.f75748a, f02.f75748a) && Intrinsics.areEqual(this.f75749b, f02.f75749b) && this.f75750c == f02.f75750c && this.f75751d == f02.f75751d && Intrinsics.areEqual(this.f75752e, f02.f75752e) && Intrinsics.areEqual(this.f75753f, f02.f75753f);
    }

    public final int hashCode() {
        int iHashCode = (this.f75752e.hashCode() + ((this.f75751d + ((this.f75750c.hashCode() + ((this.f75749b.hashCode() + (this.f75748a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f75753f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f75748a + ", packageName=" + this.f75749b + ", reporterType=" + this.f75750c + ", processID=" + this.f75751d + ", processSessionID=" + this.f75752e + ", errorEnvironment=" + this.f75753f + ')';
    }
}
