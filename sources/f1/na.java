package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f70656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f70657g;

    public na(String location, String adId, String cgn, int i10, String rewardCurrency, Float f10, Float f11) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        this.f70651a = location;
        this.f70652b = adId;
        this.f70653c = cgn;
        this.f70654d = i10;
        this.f70655e = rewardCurrency;
        this.f70656f = f10;
        this.f70657g = f11;
    }

    public final String a() {
        return this.f70652b;
    }

    public final String b() {
        return this.f70653c;
    }

    public final String c() {
        return this.f70651a;
    }

    public final int d() {
        return this.f70654d;
    }

    public final String e() {
        return this.f70655e;
    }

    public final Float f() {
        return this.f70657g;
    }

    public final Float g() {
        return this.f70656f;
    }
}
