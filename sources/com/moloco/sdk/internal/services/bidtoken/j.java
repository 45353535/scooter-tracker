package com.moloco.sdk.internal.services.bidtoken;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55351e;

    public j(String language, String osVersion, String make, String model, String hardwareVersion) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        this.f55347a = language;
        this.f55348b = osVersion;
        this.f55349c = make;
        this.f55350d = model;
        this.f55351e = hardwareVersion;
    }

    public final String a() {
        return this.f55348b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f55347a, jVar.f55347a) && Intrinsics.areEqual(this.f55348b, jVar.f55348b) && Intrinsics.areEqual(this.f55349c, jVar.f55349c) && Intrinsics.areEqual(this.f55350d, jVar.f55350d) && Intrinsics.areEqual(this.f55351e, jVar.f55351e);
    }

    public int hashCode() {
        return (((((((this.f55347a.hashCode() * 31) + this.f55348b.hashCode()) * 31) + this.f55349c.hashCode()) * 31) + this.f55350d.hashCode()) * 31) + this.f55351e.hashCode();
    }

    public String toString() {
        return "BidTokenDeviceRequestInfo(language=" + this.f55347a + ", osVersion=" + this.f55348b + ", make=" + this.f55349c + ", model=" + this.f55350d + ", hardwareVersion=" + this.f55351e + ')';
    }
}
