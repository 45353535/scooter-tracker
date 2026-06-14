package com.inmobi.media;

import com.inmobi.media.Ll;
import com.ironsource.C4240b4;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes9.dex */
public final class Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nl f37305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4180yc f37306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4180yc f37307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4180yc f37308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4180yc f37309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4180yc f37310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4180yc f37311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4180yc f37312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4180yc f37313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4180yc f37314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4180yc f37315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4180yc f37316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N5 f37317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C4180yc f37318n;

    public Ll(Mc nativeBeaconMacroData, Nl trackerData) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.f37305a = trackerData;
        C3610bj c3610bj = new C3610bj(nativeBeaconMacroData, new Function0() { // from class: w3.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.d(this.f107000b);
            }
        });
        C3610bj c3610bj2 = new C3610bj(nativeBeaconMacroData, new Function0() { // from class: w3.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.e(this.f107162b);
            }
        });
        this.f37306b = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.m3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.c(this.f107182b);
            }
        });
        this.f37307c = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.n3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.f(this.f107203b);
            }
        });
        this.f37308d = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.o3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.g(this.f107220b);
            }
        });
        this.f37309e = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.p3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.b(this.f107238b);
            }
        });
        this.f37310f = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.d3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.i(this.f107012b);
            }
        });
        this.f37311g = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.e3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.m(this.f107031b);
            }
        });
        this.f37312h = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.f3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.j(this.f107047b);
            }
        });
        this.f37313i = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.g3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.n(this.f107062b);
            }
        });
        this.f37314j = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.k(this.f107078b);
            }
        });
        this.f37315k = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.i3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.l(this.f107098b);
            }
        });
        this.f37316l = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.j3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.h(this.f107114b);
            }
        });
        this.f37317m = new N5(nativeBeaconMacroData, trackerData, c3610bj, c3610bj2);
        this.f37318n = new C4180yc(nativeBeaconMacroData, new Function0() { // from class: w3.k3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.a(this.f107137b);
            }
        });
    }

    public static final List a(Ll ll) {
        return AbstractC4197z4.a(Reporting.EventType.COMPANION_VIEW, ll.f37305a.f37461a.f38666a);
    }

    public static final List b(Ll ll) {
        return ll.a("complete", "complete");
    }

    public static final List c(Ll ll) {
        return ll.a("first_quartile", "firstQuartile");
    }

    public static final List d(Ll ll) {
        return AbstractC4197z4.a("progress_received", ll.f37305a.f37461a.f38666a);
    }

    public static final List e(Ll ll) {
        return AbstractC4197z4.a("progress_occurred", ll.f37305a.f37461a.f38666a);
    }

    public static final List f(Ll ll) {
        return ll.a("second_quartile", "midpoint");
    }

    public static final List g(Ll ll) {
        return ll.a("third_quartile", "thirdQuartile");
    }

    public static final List h(Ll ll) {
        return ll.a("error", "error");
    }

    public static final List i(Ll ll) {
        return ll.a("load", C4240b4.i.f42648r);
    }

    public static final List j(Ll ll) {
        return ll.a("mute", "mute");
    }

    public static final List k(Ll ll) {
        return ll.a("pause", "pause");
    }

    public static final List l(Ll ll) {
        return ll.a("resume", "resume");
    }

    public static final List m(Ll ll) {
        return ll.a("start", "start");
    }

    public static final List n(Ll ll) {
        return ll.a("unmute", "unmute");
    }

    public final List a(String str, String str2) {
        return CollectionsKt.plus((Collection) Jl.a(str2, this.f37305a.f37462b), (Iterable) AbstractC4197z4.a(str, this.f37305a.f37461a.f38666a));
    }
}
