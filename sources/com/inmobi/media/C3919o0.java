package com.inmobi.media;

import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3919o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC3845l1 f39131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f39132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f39133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f39134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WatermarkData f39135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdQualityControl f39136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte f39137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f39138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f39139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f39140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3738gi f39141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C3903n9 f39142t;

    public C3919o0(String str, boolean z10, long j10, boolean z11, String str2, String str3, String str4, String str5, AbstractC3845l1 abstractC3845l1, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b10, LinkedHashSet linkedHashSet, String str7, String landingScheme, C3738gi c3738gi, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f39123a = str;
        this.f39124b = z10;
        this.f39125c = j10;
        this.f39126d = z11;
        this.f39127e = str2;
        this.f39128f = str3;
        this.f39129g = str4;
        this.f39130h = str5;
        this.f39131i = abstractC3845l1;
        this.f39132j = str6;
        this.f39133k = linkedHashMap;
        this.f39134l = bool;
        this.f39135m = watermarkData;
        this.f39136n = adQualityControl;
        this.f39137o = b10;
        this.f39138p = linkedHashSet;
        this.f39139q = str7;
        this.f39140r = landingScheme;
        this.f39141s = c3738gi;
        this.f39142t = c3903n9;
    }

    public static C3919o0 a(C3919o0 c3919o0, C3738gi c3738gi, int i10) {
        boolean z10;
        C3738gi c3738gi2;
        String str = c3919o0.f39123a;
        boolean z11 = c3919o0.f39124b;
        long j10 = c3919o0.f39125c;
        boolean z12 = c3919o0.f39126d;
        String str2 = c3919o0.f39127e;
        String str3 = c3919o0.f39128f;
        String str4 = c3919o0.f39129g;
        String str5 = c3919o0.f39130h;
        String str6 = c3919o0.f39132j;
        LinkedHashMap linkedHashMap = c3919o0.f39133k;
        Boolean bool = c3919o0.f39134l;
        WatermarkData watermarkData = (i10 & 4096) != 0 ? c3919o0.f39135m : null;
        AdQualityControl adQualityControl = c3919o0.f39136n;
        byte b10 = c3919o0.f39137o;
        LinkedHashSet linkedHashSet = c3919o0.f39138p;
        String str7 = c3919o0.f39139q;
        String landingScheme = c3919o0.f39140r;
        if ((i10 & 524288) != 0) {
            z10 = z11;
            c3738gi2 = c3919o0.f39141s;
        } else {
            z10 = z11;
            c3738gi2 = c3738gi;
        }
        C3903n9 c3903n9 = c3919o0.f39142t;
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        return new C3919o0(str, z10, j10, z12, str2, str3, str4, str5, null, str6, linkedHashMap, bool, watermarkData, adQualityControl, b10, linkedHashSet, str7, landingScheme, c3738gi2, c3903n9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3919o0)) {
            return false;
        }
        C3919o0 c3919o0 = (C3919o0) obj;
        return Intrinsics.areEqual(this.f39123a, c3919o0.f39123a) && this.f39124b == c3919o0.f39124b && this.f39125c == c3919o0.f39125c && this.f39126d == c3919o0.f39126d && Intrinsics.areEqual(this.f39127e, c3919o0.f39127e) && Intrinsics.areEqual(this.f39128f, c3919o0.f39128f) && Intrinsics.areEqual(this.f39129g, c3919o0.f39129g) && Intrinsics.areEqual(this.f39130h, c3919o0.f39130h) && Intrinsics.areEqual(this.f39131i, c3919o0.f39131i) && Intrinsics.areEqual(this.f39132j, c3919o0.f39132j) && Intrinsics.areEqual(this.f39133k, c3919o0.f39133k) && Intrinsics.areEqual(this.f39134l, c3919o0.f39134l) && Intrinsics.areEqual(this.f39135m, c3919o0.f39135m) && Intrinsics.areEqual(this.f39136n, c3919o0.f39136n) && this.f39137o == c3919o0.f39137o && Intrinsics.areEqual(this.f39138p, c3919o0.f39138p) && Intrinsics.areEqual(this.f39139q, c3919o0.f39139q) && Intrinsics.areEqual(this.f39140r, c3919o0.f39140r) && Intrinsics.areEqual(this.f39141s, c3919o0.f39141s) && Intrinsics.areEqual(this.f39142t, c3919o0.f39142t);
    }

    public final int hashCode() {
        String str = this.f39123a;
        int iA = (androidx.compose.foundation.c.a(this.f39126d) + ((androidx.collection.b.a(this.f39125c) + ((androidx.compose.foundation.c.a(this.f39124b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f39127e;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39128f;
        int iHashCode2 = (this.f39129g.hashCode() + ((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f39130h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC3845l1 abstractC3845l1 = this.f39131i;
        int iHashCode4 = (iHashCode3 + (abstractC3845l1 == null ? 0 : abstractC3845l1.hashCode())) * 31;
        String str5 = this.f39132j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.f39133k;
        int iHashCode6 = (this.f39134l.hashCode() + ((iHashCode5 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        WatermarkData watermarkData = this.f39135m;
        int iHashCode7 = (iHashCode6 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.f39136n;
        int iHashCode8 = (this.f39138p.hashCode() + ((this.f39137o + ((iHashCode7 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.f39139q;
        int iHashCode9 = (this.f39140r.hashCode() + ((androidx.compose.foundation.c.a(false) + ((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        C3738gi c3738gi = this.f39141s;
        int iHashCode10 = (iHashCode9 + (c3738gi == null ? 0 : c3738gi.hashCode())) * 31;
        C3903n9 c3903n9 = this.f39142t;
        return androidx.collection.b.a(-1L) + ((iHashCode10 + (c3903n9 != null ? c3903n9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f39123a;
        boolean z10 = this.f39124b;
        long j10 = this.f39125c;
        boolean z11 = this.f39126d;
        String str2 = this.f39127e;
        String str3 = this.f39128f;
        String str4 = this.f39129g;
        String str5 = this.f39130h;
        AbstractC3845l1 abstractC3845l1 = this.f39131i;
        String str6 = this.f39132j;
        LinkedHashMap linkedHashMap = this.f39133k;
        Boolean bool = this.f39134l;
        WatermarkData watermarkData = this.f39135m;
        AdQualityControl adQualityControl = this.f39136n;
        byte b10 = this.f39137o;
        return "AdMetaData(adType=" + str + ", isImmersiveMode=" + z10 + ", placementId=" + j10 + ", allowAutoRedirection=" + z11 + ", creativeId=" + str2 + ", creativeType=" + str3 + ", markupTypeAdUnit=" + str4 + ", adSize=" + str5 + ", adPodHandler=" + abstractC3845l1 + ", contentURL=" + str6 + ", telemetryManagerMap=" + linkedHashMap + ", isHardwareAccelerationDisabled=" + bool + ", watermarkData=" + watermarkData + ", adQualityControl=" + adQualityControl + ", placementType=" + ((int) b10) + ", viewabilityTrackers=" + this.f39138p + ", impressionId=" + this.f39139q + ", isInAppBrowser=false, landingScheme=" + this.f39140r + ", renderViewMetaData=" + this.f39141s + ", logger=" + this.f39142t + ", viewTouchTimestamp=-1)";
    }
}
