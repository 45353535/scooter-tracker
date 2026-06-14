package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f37071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37073d;

    public Ie(long j10, Map headers, int i10, String str) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f37070a = j10;
        this.f37071b = headers;
        this.f37072c = i10;
        this.f37073d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ie)) {
            return false;
        }
        Ie ie2 = (Ie) obj;
        return this.f37070a == ie2.f37070a && Intrinsics.areEqual(this.f37071b, ie2.f37071b) && this.f37072c == ie2.f37072c && Intrinsics.areEqual(this.f37073d, ie2.f37073d);
    }

    public final int hashCode() {
        int iA = AbstractC3712fi.a(this.f37072c, (this.f37071b.hashCode() + (androidx.collection.b.a(this.f37070a) * 31)) * 31, 31);
        String str = this.f37073d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkMetaData(timeTaken=" + this.f37070a + ", headers=" + this.f37071b + ", contentLength=" + this.f37072c + ", contentType=" + this.f37073d + ")";
    }
}
