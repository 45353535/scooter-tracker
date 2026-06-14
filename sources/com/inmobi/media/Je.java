package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Je extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f37136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3964pk f37137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f37138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f37139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37140f;

    public Je(String url, HashMap map, C3964pk c3964pk, Map map2, Ai ai2, boolean z10, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3964pk = (i10 & 4) != 0 ? null : c3964pk;
        map2 = (i10 & 8) != 0 ? null : map2;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        z10 = (i10 & 32) != 0 ? true : z10;
        Intrinsics.checkNotNullParameter(url, "url");
        this.f37135a = url;
        this.f37136b = map;
        this.f37137c = c3964pk;
        this.f37138d = map2;
        this.f37139e = ai2;
        this.f37140f = z10;
        String strA = Se.a(url, map2);
        Intrinsics.checkNotNullParameter(strA, "<set-?>");
        this.f37135a = strA;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f37136b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f37139e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f37135a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Je)) {
            return false;
        }
        Je je2 = (Je) obj;
        return Intrinsics.areEqual(this.f37135a, je2.f37135a) && Intrinsics.areEqual(this.f37136b, je2.f37136b) && Intrinsics.areEqual(this.f37137c, je2.f37137c) && Intrinsics.areEqual(this.f37138d, je2.f37138d) && Intrinsics.areEqual(this.f37139e, je2.f37139e) && this.f37140f == je2.f37140f;
    }

    public final int hashCode() {
        int iHashCode = this.f37135a.hashCode() * 31;
        Map map = this.f37136b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3964pk c3964pk = this.f37137c;
        int iHashCode3 = (iHashCode2 + (c3964pk == null ? 0 : c3964pk.hashCode())) * 31;
        Map map2 = this.f37138d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Ai ai2 = this.f37139e;
        return androidx.compose.foundation.c.a(this.f37140f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.f37135a + "', headers=" + this.f37136b + ", queryParams=" + this.f37138d + ", retryPolicy=" + this.f37139e + ", timeouts=" + this.f37137c + ", followRedirects=" + this.f37140f + ")";
    }
}
