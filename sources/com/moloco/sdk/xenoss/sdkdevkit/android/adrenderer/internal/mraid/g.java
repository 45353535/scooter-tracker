package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f56443a;

    public g(k0 k0Var) {
        this.f56443a = k0Var;
    }

    public final g a(k0 k0Var) {
        return new g(k0Var);
    }

    public final k0 b() {
        return this.f56443a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f56443a, ((g) obj).f56443a);
    }

    public int hashCode() {
        k0 k0Var = this.f56443a;
        if (k0Var == null) {
            return 0;
        }
        return k0Var.hashCode();
    }

    public String toString() {
        return "MraidAdData(dec=" + this.f56443a + ')';
    }

    public /* synthetic */ g(k0 k0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : k0Var);
    }
}
