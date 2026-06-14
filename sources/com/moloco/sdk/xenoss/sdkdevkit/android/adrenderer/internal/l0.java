package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f56215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f56217c;

    public l0(Integer num, String str, m0 m0Var) {
        this.f56215a = num;
        this.f56216b = str;
        this.f56217c = m0Var;
    }

    public final String a() {
        return this.f56216b;
    }

    public final m0 b() {
        return this.f56217c;
    }

    public final Integer c() {
        return this.f56215a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.f56215a, l0Var.f56215a) && Intrinsics.areEqual(this.f56216b, l0Var.f56216b) && Intrinsics.areEqual(this.f56217c, l0Var.f56217c);
    }

    public int hashCode() {
        Integer num = this.f56215a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f56216b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m0 m0Var = this.f56217c;
        return iHashCode2 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public String toString() {
        return "DECAppIcon(size=" + this.f56215a + ", appIconUri=" + this.f56216b + ", border=" + this.f56217c + ')';
    }
}
