package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4043t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3994r1 f39565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f39567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f39569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39570f;

    public C4043t0(C3994r1 adUnitTelemetry, String str, Boolean bool, String str2, byte b10, String str3) {
        Intrinsics.checkNotNullParameter(adUnitTelemetry, "adUnitTelemetry");
        this.f39565a = adUnitTelemetry;
        this.f39566b = str;
        this.f39567c = bool;
        this.f39568d = str2;
        this.f39569e = b10;
        this.f39570f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4043t0)) {
            return false;
        }
        C4043t0 c4043t0 = (C4043t0) obj;
        return Intrinsics.areEqual(this.f39565a, c4043t0.f39565a) && Intrinsics.areEqual(this.f39566b, c4043t0.f39566b) && Intrinsics.areEqual(this.f39567c, c4043t0.f39567c) && Intrinsics.areEqual(this.f39568d, c4043t0.f39568d) && this.f39569e == c4043t0.f39569e && Intrinsics.areEqual(this.f39570f, c4043t0.f39570f);
    }

    public final int hashCode() {
        int iHashCode = this.f39565a.hashCode() * 31;
        String str = this.f39566b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f39567c;
        int iHashCode3 = (this.f39569e + ((this.f39568d.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f39570f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C3994r1 c3994r1 = this.f39565a;
        String str = this.f39566b;
        Boolean bool = this.f39567c;
        String str2 = this.f39568d;
        byte b10 = this.f39569e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c3994r1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b10) + ", impressionId=" + this.f39570f + ")";
    }
}
