package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f14077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f14078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14081g;

    public p(String str, String userLocale, JSONObject jSONObject, JSONObject jSONObject2, String str2, String userTimezone, long j10) {
        Intrinsics.checkNotNullParameter(userLocale, "userLocale");
        Intrinsics.checkNotNullParameter(userTimezone, "userTimezone");
        this.f14075a = str;
        this.f14076b = userLocale;
        this.f14077c = jSONObject;
        this.f14078d = jSONObject2;
        this.f14079e = str2;
        this.f14080f = userTimezone;
        this.f14081g = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f14075a, pVar.f14075a) && Intrinsics.areEqual(this.f14076b, pVar.f14076b) && Intrinsics.areEqual(this.f14077c, pVar.f14077c) && Intrinsics.areEqual(this.f14078d, pVar.f14078d) && Intrinsics.areEqual(this.f14079e, pVar.f14079e) && Intrinsics.areEqual(this.f14080f, pVar.f14080f) && this.f14081g == pVar.f14081g;
    }

    public final int hashCode() {
        String str = this.f14075a;
        int iA = com.appodeal.ads.initializing.f.a(this.f14076b, (str == null ? 0 : str.hashCode()) * 31, 31);
        JSONObject jSONObject = this.f14077c;
        int iHashCode = (iA + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        JSONObject jSONObject2 = this.f14078d;
        int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        String str2 = this.f14079e;
        return androidx.collection.b.a(this.f14081g) + com.appodeal.ads.initializing.f.a(this.f14080f, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "User(userId=" + this.f14075a + ", userLocale=" + this.f14076b + ", userIabConsentData=" + this.f14077c + ", userToken=" + this.f14078d + ", userAgent=" + this.f14079e + ", userTimezone=" + this.f14080f + ", userLocalTime=" + this.f14081g + ")";
    }
}
