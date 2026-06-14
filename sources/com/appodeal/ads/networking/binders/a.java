package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14003b;

    public a(String adapterVersion, String adapterSdkVersion) {
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        Intrinsics.checkNotNullParameter(adapterSdkVersion, "adapterSdkVersion");
        this.f14002a = adapterVersion;
        this.f14003b = adapterSdkVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f14002a, aVar.f14002a) && Intrinsics.areEqual(this.f14003b, aVar.f14003b);
    }

    public final int hashCode() {
        return this.f14003b.hashCode() + (this.f14002a.hashCode() * 31);
    }

    public final String toString() {
        return "ModuleInfo(adapterVersion=" + this.f14002a + ", adapterSdkVersion=" + this.f14003b + ")";
    }
}
