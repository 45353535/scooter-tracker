package com.appodeal.ads.utils.debug;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f14991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f14992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f14993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f14994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f14995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f14996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f14997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g[] f14998j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14999b;

    static {
        g gVar = new g("REPORT", 0, "debug.appodeal.sdk.report");
        f14991c = gVar;
        g gVar2 = new g("TEST_MODE", 1, "debug.appodeal.sdk.testmode");
        f14992d = gVar2;
        g gVar3 = new g("HOST_URL", 2, "debug.appodeal.sdk.url");
        f14993e = gVar3;
        g gVar4 = new g("INTERNAL_LOG", 3, "debug.appodeal.sdk.log");
        f14994f = gVar4;
        g gVar5 = new g("LOG_LEVEL", 4, "debug.appodeal.sdk.loglevel");
        f14995g = gVar5;
        g gVar6 = new g("TEST_ACTIVITY", 5, "debug.appodeal.sdk.testactivity");
        f14996h = gVar6;
        g gVar7 = new g("DISABLE_NETWORKS", 6, "debug.appodeal.sdk.networks");
        f14997i = gVar7;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
        f14998j = gVarArr;
        qf.a.a(gVarArr);
    }

    public g(String str, int i10, String str2) {
        this.f14999b = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14998j.clone();
    }

    public final String d() {
        return this.f14999b;
    }
}
