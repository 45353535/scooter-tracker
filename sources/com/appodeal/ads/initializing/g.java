package com.appodeal.ads.initializing;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13477c;

    public g(String name, String adapterVersion, String adapterSdkVersion) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        Intrinsics.checkNotNullParameter(adapterSdkVersion, "adapterSdkVersion");
        this.f13475a = name;
        this.f13476b = adapterVersion;
        this.f13477c = adapterSdkVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f13475a, gVar.f13475a) && Intrinsics.areEqual(this.f13476b, gVar.f13476b) && Intrinsics.areEqual(this.f13477c, gVar.f13477c);
    }

    public final int hashCode() {
        return this.f13477c.hashCode() + f.a(this.f13476b, this.f13475a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdNetworkInfo(name=" + this.f13475a + ", adapterVersion=" + this.f13476b + ", adapterSdkVersion=" + this.f13477c + ")";
    }
}
