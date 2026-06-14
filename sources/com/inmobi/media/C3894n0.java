package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3894n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f39070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39072h;

    public C3894n0(String clientRequestId, Map map, long j10, String monetizationContext, String str, Map map2, String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(clientRequestId, "clientRequestId");
        Intrinsics.checkNotNullParameter("im", "integrationTypeString");
        Intrinsics.checkNotNullParameter(monetizationContext, "monetizationContext");
        Intrinsics.checkNotNullParameter("unifiedSdkJson", "adFormat");
        this.f39065a = clientRequestId;
        this.f39066b = map;
        this.f39067c = j10;
        this.f39068d = monetizationContext;
        this.f39069e = str;
        this.f39070f = map2;
        this.f39071g = str2;
        this.f39072h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3894n0)) {
            return false;
        }
        C3894n0 c3894n0 = (C3894n0) obj;
        return Intrinsics.areEqual(this.f39065a, c3894n0.f39065a) && Intrinsics.areEqual("im", "im") && Intrinsics.areEqual(this.f39066b, c3894n0.f39066b) && this.f39067c == c3894n0.f39067c && Intrinsics.areEqual(this.f39068d, c3894n0.f39068d) && Intrinsics.areEqual(this.f39069e, c3894n0.f39069e) && Intrinsics.areEqual("unifiedSdkJson", "unifiedSdkJson") && Intrinsics.areEqual(this.f39070f, c3894n0.f39070f) && Intrinsics.areEqual(this.f39071g, c3894n0.f39071g) && this.f39072h == c3894n0.f39072h && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iHashCode = ((this.f39065a.hashCode() * 31) + 3364) * 31;
        Map map = this.f39066b;
        int iHashCode2 = (this.f39068d.hashCode() + ((androidx.collection.b.a(this.f39067c) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        String str = this.f39069e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f39070f;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.f39071g;
        return (androidx.compose.foundation.c.a(this.f39072h) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.f39065a + ", integrationTypeString=im, extras=" + this.f39066b + ", imPlacementId=" + this.f39067c + ", monetizationContext=" + this.f39068d + ", adType=" + this.f39069e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f39070f + ", keywords=" + this.f39071g + ", isApplicationMutedByPub=" + this.f39072h + ", extraInfo=" + ((Object) null) + ")";
    }
}
