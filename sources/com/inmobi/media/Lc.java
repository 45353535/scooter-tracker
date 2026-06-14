package com.inmobi.media;

import com.inmobi.media.Lc;
import com.ironsource.C4240b4;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pc f37277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3610bj f37278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4180yc f37279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3610bj f37280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3610bj f37281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3610bj f37282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3610bj f37283g;

    public Lc(Mc nativeBeaconMacroData, Pc trackerData) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.f37277a = trackerData;
        this.f37278b = new C3610bj(nativeBeaconMacroData, new Function0() { // from class: w3.u2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Lc.c(this.f107331b);
            }
        });
        this.f37279c = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.v2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Lc.a();
            }
        });
        this.f37280d = new C3610bj(nativeBeaconMacroData, new Function0() { // from class: w3.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Lc.e(this.f107362b);
            }
        });
        this.f37281e = new C3610bj(nativeBeaconMacroData, new Function0() { // from class: w3.x2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Lc.b(this.f107374b);
            }
        });
        this.f37282f = new C3610bj(nativeBeaconMacroData, new Function0() { // from class: w3.y2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Lc.a(this.f107389b);
            }
        });
        this.f37283g = new C3610bj(nativeBeaconMacroData, new Function0() { // from class: w3.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Lc.d(this.f107408b);
            }
        });
    }

    public static final List a() {
        return CollectionsKt.emptyList();
    }

    public static final List b(Lc lc2) {
        return AbstractC4197z4.a("impression_shown", lc2.f37277a.f37537a.f39865a);
    }

    public static final List c(Lc lc2) {
        return AbstractC4197z4.a(C4240b4.i.f42648r, lc2.f37277a.f37537a.f39865a);
    }

    public static final List d(Lc lc2) {
        return AbstractC4197z4.a("mrc50", lc2.f37277a.f37537a.f39865a);
    }

    public static final List e(Lc lc2) {
        return AbstractC4197z4.a("start_tracking", lc2.f37277a.f37537a.f39865a);
    }

    public static final List a(Lc lc2) {
        return CollectionsKt.plus((Collection) AbstractC4197z4.a("impression", lc2.f37277a.f37537a.f39865a), (Iterable) Jl.a(com.taurusx.tax.f.y.f66057w, lc2.f37277a.f37538b));
    }
}
