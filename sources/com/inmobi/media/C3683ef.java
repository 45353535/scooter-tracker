package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3683ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38518b;

    public C3683ef(String hyperId, String spHost) {
        Intrinsics.checkNotNullParameter(hyperId, "hyperId");
        Intrinsics.checkNotNullParameter("i6i", "sspId");
        Intrinsics.checkNotNullParameter(spHost, "spHost");
        Intrinsics.checkNotNullParameter("inmobi", "pubId");
        this.f38517a = hyperId;
        this.f38518b = spHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3683ef)) {
            return false;
        }
        C3683ef c3683ef = (C3683ef) obj;
        return Intrinsics.areEqual(this.f38517a, c3683ef.f38517a) && Intrinsics.areEqual("i6i", "i6i") && Intrinsics.areEqual(this.f38518b, c3683ef.f38518b) && Intrinsics.areEqual("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.f38518b.hashCode() + (((this.f38517a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f38517a + ", sspId=i6i, spHost=" + this.f38518b + ", pubId=inmobi)";
    }
}
