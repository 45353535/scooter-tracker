package com.appodeal.ads.utils.debug;

import j$.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f15012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15014g;

    public r(int i10, int i11, String str, String str2, String str3, String str4, boolean z10) {
        this.f15008a = i10;
        this.f15014g = i11;
        this.f15009b = str;
        this.f15010c = str2;
        this.f15011d = Integer.parseInt(str3);
        this.f15012e = Double.parseDouble(str4);
        this.f15013f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f15010c, ((r) obj).f15010c);
    }

    public final int hashCode() {
        String str = this.f15010c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
