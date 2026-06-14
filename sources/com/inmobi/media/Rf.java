package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f37660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f37665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f37666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f37667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3738gi f37668k;

    public Rf(String url, String id2, Map headers, boolean z10, String priority, boolean z11, int i10, String ownerId, long j10, Long l10, C3738gi c3738gi) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f37658a = url;
        this.f37659b = id2;
        this.f37660c = headers;
        this.f37661d = z10;
        this.f37662e = priority;
        this.f37663f = z11;
        this.f37664g = i10;
        this.f37665h = ownerId;
        this.f37666i = j10;
        this.f37667j = l10;
        this.f37668k = c3738gi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rf)) {
            return false;
        }
        Rf rf2 = (Rf) obj;
        return Intrinsics.areEqual(this.f37658a, rf2.f37658a) && Intrinsics.areEqual(this.f37659b, rf2.f37659b) && Intrinsics.areEqual(this.f37660c, rf2.f37660c) && this.f37661d == rf2.f37661d && Intrinsics.areEqual(this.f37662e, rf2.f37662e) && this.f37663f == rf2.f37663f && this.f37664g == rf2.f37664g && Intrinsics.areEqual(this.f37665h, rf2.f37665h) && this.f37666i == rf2.f37666i && Intrinsics.areEqual(this.f37667j, rf2.f37667j) && Intrinsics.areEqual(this.f37668k, rf2.f37668k);
    }

    public final int hashCode() {
        int iA = (androidx.collection.b.a(this.f37666i) + ((this.f37665h.hashCode() + AbstractC3712fi.a(this.f37664g, (androidx.compose.foundation.c.a(this.f37663f) + ((this.f37662e.hashCode() + ((androidx.compose.foundation.c.a(this.f37661d) + ((this.f37660c.hashCode() + ((this.f37659b.hashCode() + (this.f37658a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        Long l10 = this.f37667j;
        int iHashCode = (iA + (l10 == null ? 0 : l10.hashCode())) * 31;
        C3738gi c3738gi = this.f37668k;
        return iHashCode + (c3738gi != null ? c3738gi.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.f37658a + ", id=" + this.f37659b + ", headers=" + this.f37660c + ", allowRedirects=" + this.f37661d + ", priority=" + this.f37662e + ", ackRequired=" + this.f37663f + ", retryCount=" + this.f37664g + ", ownerId=" + this.f37665h + ", createdAt=" + this.f37666i + ", retryAfterTimestamp=" + this.f37667j + ", telemetryData=" + this.f37668k + ")";
    }
}
