package com.appodeal.ads.adapters.iab.unified;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f12259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f12260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f12261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f12262e;

    static {
        g gVar = new g("IMAGE", 0);
        f12259b = gVar;
        g gVar2 = new g("PLAYING", 1);
        f12260c = gVar2;
        g gVar3 = new g("PAUSED", 2);
        f12261d = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f12262e = gVarArr;
        qf.a.a(gVarArr);
    }

    public g(String str, int i10) {
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f12262e.clone();
    }
}
