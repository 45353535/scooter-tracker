package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f55602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f55603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f55604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f55605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f55606m;

    public h0(String manufacturer, String model, String hwVersion, boolean z10, String os, String osVersion, int i10, String language, String mobileCarrier, float f10, long j10, String hardware, String brand) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hwVersion, "hwVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.f55594a = manufacturer;
        this.f55595b = model;
        this.f55596c = hwVersion;
        this.f55597d = z10;
        this.f55598e = os;
        this.f55599f = osVersion;
        this.f55600g = i10;
        this.f55601h = language;
        this.f55602i = mobileCarrier;
        this.f55603j = f10;
        this.f55604k = j10;
        this.f55605l = hardware;
        this.f55606m = brand;
    }

    public final String a() {
        return this.f55606m;
    }

    public final long b() {
        return this.f55604k;
    }

    public final String c() {
        return this.f55605l;
    }

    public final String d() {
        return this.f55596c;
    }

    public final String e() {
        return this.f55601h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.areEqual(this.f55594a, h0Var.f55594a) && Intrinsics.areEqual(this.f55595b, h0Var.f55595b) && Intrinsics.areEqual(this.f55596c, h0Var.f55596c) && this.f55597d == h0Var.f55597d && Intrinsics.areEqual(this.f55598e, h0Var.f55598e) && Intrinsics.areEqual(this.f55599f, h0Var.f55599f) && this.f55600g == h0Var.f55600g && Intrinsics.areEqual(this.f55601h, h0Var.f55601h) && Intrinsics.areEqual(this.f55602i, h0Var.f55602i) && Float.compare(this.f55603j, h0Var.f55603j) == 0 && this.f55604k == h0Var.f55604k && Intrinsics.areEqual(this.f55605l, h0Var.f55605l) && Intrinsics.areEqual(this.f55606m, h0Var.f55606m);
    }

    public final String f() {
        return this.f55594a;
    }

    public final String g() {
        return this.f55602i;
    }

    public final String h() {
        return this.f55595b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f55594a.hashCode() * 31) + this.f55595b.hashCode()) * 31) + this.f55596c.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f55597d)) * 31) + this.f55598e.hashCode()) * 31) + this.f55599f.hashCode()) * 31) + this.f55600g) * 31) + this.f55601h.hashCode()) * 31) + this.f55602i.hashCode()) * 31) + Float.floatToIntBits(this.f55603j)) * 31) + androidx.collection.b.a(this.f55604k)) * 31) + this.f55605l.hashCode()) * 31) + this.f55606m.hashCode();
    }

    public final String i() {
        return this.f55598e;
    }

    public final String j() {
        return this.f55599f;
    }

    public final float k() {
        return this.f55603j;
    }

    public final boolean l() {
        return this.f55597d;
    }

    public String toString() {
        return "DeviceInfo(manufacturer=" + this.f55594a + ", model=" + this.f55595b + ", hwVersion=" + this.f55596c + ", isTablet=" + this.f55597d + ", os=" + this.f55598e + ", osVersion=" + this.f55599f + ", apiLevel=" + this.f55600g + ", language=" + this.f55601h + ", mobileCarrier=" + this.f55602i + ", screenDensity=" + this.f55603j + ", dbtMs=" + this.f55604k + ", hardware=" + this.f55605l + ", brand=" + this.f55606m + ')';
    }
}
