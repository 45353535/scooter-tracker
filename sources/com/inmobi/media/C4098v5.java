package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4098v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39736b;

    public C4098v5(String str, boolean z10) {
        this.f39735a = z10;
        this.f39736b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4098v5)) {
            return false;
        }
        C4098v5 c4098v5 = (C4098v5) obj;
        return this.f39735a == c4098v5.f39735a && Intrinsics.areEqual(this.f39736b, c4098v5.f39736b);
    }

    public final int hashCode() {
        int iA = androidx.compose.foundation.c.a(this.f39735a) * 31;
        String str = this.f39736b;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.f39735a + ", version=" + this.f39736b + ")";
    }
}
