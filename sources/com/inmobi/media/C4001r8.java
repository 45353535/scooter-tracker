package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4001r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39458e;

    public C4001r8(ArrayList omidTrackers, Map macros, String customReferenceData, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        this.f39454a = omidTrackers;
        this.f39455b = macros;
        this.f39456c = customReferenceData;
        this.f39457d = str;
        this.f39458e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4001r8)) {
            return false;
        }
        C4001r8 c4001r8 = (C4001r8) obj;
        return Intrinsics.areEqual(this.f39454a, c4001r8.f39454a) && Intrinsics.areEqual(this.f39455b, c4001r8.f39455b) && Intrinsics.areEqual(this.f39456c, c4001r8.f39456c) && Intrinsics.areEqual(this.f39457d, c4001r8.f39457d) && this.f39458e == c4001r8.f39458e;
    }

    public final int hashCode() {
        int iHashCode = (this.f39456c.hashCode() + ((this.f39455b.hashCode() + (this.f39454a.hashCode() * 31)) * 31)) * 31;
        String str = this.f39457d;
        return androidx.compose.foundation.c.a(this.f39458e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.f39454a + ", macros=" + this.f39455b + ", customReferenceData=" + this.f39456c + ", contentUrl=" + this.f39457d + ", isolateVerificationScripts=" + this.f39458e + ")";
    }
}
