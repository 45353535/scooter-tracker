package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MolocoAdError f54211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f54212b;

    public d0(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        this.f54211a = molocoAdError;
        this.f54212b = subErrorType;
    }

    public final MolocoAdError a() {
        return this.f54211a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.f54212b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.f54211a, d0Var.f54211a) && Intrinsics.areEqual(this.f54212b, d0Var.f54212b);
    }

    public int hashCode() {
        return (this.f54211a.hashCode() * 31) + this.f54212b.hashCode();
    }

    public String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.f54211a + ", subErrorType=" + this.f54212b + ')';
    }
}
