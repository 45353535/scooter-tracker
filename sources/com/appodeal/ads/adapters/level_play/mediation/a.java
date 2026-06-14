package com.appodeal.ads.adapters.level_play.mediation;

import com.taurusx.tax.w.s.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f12417g;

    static {
        a aVar = new a("INTERSTITIAL", 0);
        f12412b = aVar;
        a aVar2 = new a(w.f67531f, 1);
        f12413c = aVar2;
        a aVar3 = new a("BANNER", 2);
        f12414d = aVar3;
        a aVar4 = new a("LEADER", 3);
        f12415e = aVar4;
        a aVar5 = new a("MREC", 4);
        f12416f = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f12417g = aVarArr;
        qf.a.a(aVarArr);
    }

    public a(String str, int i10) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12417g.clone();
    }
}
