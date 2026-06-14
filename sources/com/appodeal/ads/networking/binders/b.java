package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f14005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f14006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f14008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f14009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f14010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14011h;

    public b(String adType, Boolean bool, Boolean bool2, String str, Long l10, Long l11, Long l12, String str2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f14004a = adType;
        this.f14005b = bool;
        this.f14006c = bool2;
        this.f14007d = str;
        this.f14008e = l10;
        this.f14009f = l11;
        this.f14010g = l12;
        this.f14011h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f14004a, bVar.f14004a) && Intrinsics.areEqual(this.f14005b, bVar.f14005b) && Intrinsics.areEqual(this.f14006c, bVar.f14006c) && Intrinsics.areEqual(this.f14007d, bVar.f14007d) && Intrinsics.areEqual(this.f14008e, bVar.f14008e) && Intrinsics.areEqual(this.f14009f, bVar.f14009f) && Intrinsics.areEqual(this.f14010g, bVar.f14010g) && Intrinsics.areEqual(this.f14011h, bVar.f14011h);
    }

    public final int hashCode() {
        int iHashCode = this.f14004a.hashCode() * 31;
        Boolean bool = this.f14005b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f14006c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f14007d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f14008e;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f14009f;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f14010g;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.f14011h;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AdRequest(adType=" + this.f14004a + ", rewardedVideo=" + this.f14005b + ", largeBanners=" + this.f14006c + ", mainId=" + this.f14007d + ", showTimeStamp=" + this.f14008e + ", clickTimeStamp=" + this.f14009f + ", finishTimeStamp=" + this.f14010g + ", impressionId=" + this.f14011h + ")";
    }
}
