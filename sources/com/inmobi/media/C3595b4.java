package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3595b4 extends AbstractC3948p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38244c;

    public C3595b4(int i10, long j10, String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        this.f38242a = configType;
        this.f38243b = i10;
        this.f38244c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3595b4)) {
            return false;
        }
        C3595b4 c3595b4 = (C3595b4) obj;
        return Intrinsics.areEqual(this.f38242a, c3595b4.f38242a) && this.f38243b == c3595b4.f38243b && this.f38244c == c3595b4.f38244c;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f38244c) + AbstractC3712fi.a(this.f38243b, this.f38242a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.f38242a + ", errorCode=" + this.f38243b + ", lastUpdatedTimestamp=" + this.f38244c + ")";
    }
}
