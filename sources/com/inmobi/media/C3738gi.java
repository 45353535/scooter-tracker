package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3738gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4093v0 f38640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f38646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3970q1 f38649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3862li f38650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f38651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InlineParams f38652m;

    public C3738gi(C4093v0 placement, String markupType, String impressionId, String telemetryMetadataBlob, int i10, String creativeType, String creativeId, boolean z10, int i11, C3970q1 c3970q1, C3862li c3862li, String str, InlineParams inlineParams) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        this.f38640a = placement;
        this.f38641b = markupType;
        this.f38642c = impressionId;
        this.f38643d = telemetryMetadataBlob;
        this.f38644e = i10;
        this.f38645f = creativeType;
        this.f38646g = creativeId;
        this.f38647h = z10;
        this.f38648i = i11;
        this.f38649j = c3970q1;
        this.f38650k = c3862li;
        this.f38651l = str;
        this.f38652m = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3738gi)) {
            return false;
        }
        C3738gi c3738gi = (C3738gi) obj;
        return Intrinsics.areEqual(this.f38640a, c3738gi.f38640a) && Intrinsics.areEqual(this.f38641b, c3738gi.f38641b) && Intrinsics.areEqual(this.f38642c, c3738gi.f38642c) && Intrinsics.areEqual(this.f38643d, c3738gi.f38643d) && this.f38644e == c3738gi.f38644e && Intrinsics.areEqual(this.f38645f, c3738gi.f38645f) && Intrinsics.areEqual(this.f38646g, c3738gi.f38646g) && this.f38647h == c3738gi.f38647h && this.f38648i == c3738gi.f38648i && Intrinsics.areEqual(this.f38649j, c3738gi.f38649j) && Intrinsics.areEqual(this.f38650k, c3738gi.f38650k) && Intrinsics.areEqual(this.f38651l, c3738gi.f38651l) && Intrinsics.areEqual(this.f38652m, c3738gi.f38652m);
    }

    public final int hashCode() {
        int iA = AbstractC3712fi.a(this.f38648i, (androidx.compose.foundation.c.a(this.f38647h) + ((this.f38646g.hashCode() + ((this.f38645f.hashCode() + AbstractC3712fi.a(this.f38644e, (this.f38643d.hashCode() + ((this.f38642c.hashCode() + ((this.f38641b.hashCode() + (this.f38640a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C3970q1 c3970q1 = this.f38649j;
        int iHashCode = (iA + (c3970q1 == null ? 0 : c3970q1.hashCode())) * 31;
        C3862li c3862li = this.f38650k;
        int i10 = (iHashCode + (c3862li == null ? 0 : c3862li.f38985a)) * 31;
        String str = this.f38651l;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.f38652m;
        return iHashCode2 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f38640a + ", markupType=" + this.f38641b + ", impressionId=" + this.f38642c + ", telemetryMetadataBlob=" + this.f38643d + ", internetAvailabilityAdRetryCount=" + this.f38644e + ", creativeType=" + this.f38645f + ", creativeId=" + this.f38646g + ", isRewarded=" + this.f38647h + ", adIndex=" + this.f38648i + ", adUnitTelemetryData=" + this.f38649j + ", renderViewTelemetryData=" + this.f38650k + ", renderViewId=" + this.f38651l + ", inlineParams=" + this.f38652m + ")";
    }
}
