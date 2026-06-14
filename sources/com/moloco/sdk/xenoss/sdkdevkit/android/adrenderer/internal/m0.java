package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f56219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56220b;

    public m0(Integer num, List gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f56219a = num;
        this.f56220b = gradient;
    }

    public final Integer a() {
        return this.f56219a;
    }

    public final List b() {
        return this.f56220b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.areEqual(this.f56219a, m0Var.f56219a) && Intrinsics.areEqual(this.f56220b, m0Var.f56220b);
    }

    public int hashCode() {
        Integer num = this.f56219a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.f56220b.hashCode();
    }

    public String toString() {
        return "DECBorder(borderWidth=" + this.f56219a + ", gradient=" + this.f56220b + ')';
    }
}
