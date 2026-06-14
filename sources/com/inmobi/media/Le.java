package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Le extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f37289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3964pk f37290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4086ui f37291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f37292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37293f;

    public Le(String url, Map map, C3964pk c3964pk, AbstractC4086ui abstractC4086ui, Ai ai2, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3964pk = (i10 & 4) != 0 ? null : c3964pk;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        Intrinsics.checkNotNullParameter(url, "url");
        this.f37288a = url;
        this.f37289b = map;
        this.f37290c = c3964pk;
        this.f37291d = abstractC4086ui;
        this.f37292e = ai2;
        this.f37293f = true;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f37289b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f37292e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f37288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le)) {
            return false;
        }
        Le le2 = (Le) obj;
        return Intrinsics.areEqual(this.f37288a, le2.f37288a) && Intrinsics.areEqual(this.f37289b, le2.f37289b) && Intrinsics.areEqual(this.f37290c, le2.f37290c) && Intrinsics.areEqual(this.f37291d, le2.f37291d) && Intrinsics.areEqual(this.f37292e, le2.f37292e) && this.f37293f == le2.f37293f;
    }

    public final int hashCode() {
        int iHashCode = this.f37288a.hashCode() * 31;
        Map map = this.f37289b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3964pk c3964pk = this.f37290c;
        int iHashCode3 = (iHashCode2 + (c3964pk == null ? 0 : c3964pk.hashCode())) * 31;
        AbstractC4086ui abstractC4086ui = this.f37291d;
        int iHashCode4 = (iHashCode3 + (abstractC4086ui == null ? 0 : abstractC4086ui.hashCode())) * 31;
        Ai ai2 = this.f37292e;
        return androidx.compose.foundation.c.a(this.f37293f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.f37288a + "', headers=" + this.f37289b + ", body=" + this.f37291d + ", retryPolicy=" + this.f37292e + ", timeouts=" + this.f37290c + ", followRedirects=" + this.f37293f + ")";
    }
}
