package com.appodeal.ads;

import com.appodeal.ads.api.Stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b3 f13109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b3 f13110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b3 f13111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b3 f13112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b3 f13113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b3 f13114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b3 f13115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b3 f13116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b3 f13117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b3 f13118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ b3[] f13119m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stats.AdUnitRequestResult f13120b;

    static {
        b3 b3Var = new b3("Successful", 0, Stats.AdUnitRequestResult.SUCCESSFUL);
        f13109c = b3Var;
        b3 b3Var2 = new b3("NoFill", 1, Stats.AdUnitRequestResult.NOFILL);
        f13110d = b3Var2;
        b3 b3Var3 = new b3("TimeOutReached", 2, Stats.AdUnitRequestResult.TIMEOUTREACHED);
        f13111e = b3Var3;
        Stats.AdUnitRequestResult adUnitRequestResult = Stats.AdUnitRequestResult.EXCEPTION;
        b3 b3Var4 = new b3("Exception", 3, adUnitRequestResult);
        f13112f = b3Var4;
        b3 b3Var5 = new b3("UndefinedAdapter", 4, Stats.AdUnitRequestResult.UNDEFINEDADAPTER);
        f13113g = b3Var5;
        b3 b3Var6 = new b3("IncorrectAdunit", 5, Stats.AdUnitRequestResult.INCORRECTADUNIT);
        f13114h = b3Var6;
        b3 b3Var7 = new b3("InvalidAssets", 6, Stats.AdUnitRequestResult.INVALIDASSETS);
        f13115i = b3Var7;
        b3 b3Var8 = new b3("Unrecognized", 7, Stats.AdUnitRequestResult.UNRECOGNIZED);
        f13116j = b3Var8;
        b3 b3Var9 = new b3("Canceled", 8, Stats.AdUnitRequestResult.CANCELED);
        f13117k = b3Var9;
        b3 b3Var10 = new b3("IncorrectCreative", 9, adUnitRequestResult);
        f13118l = b3Var10;
        b3[] b3VarArr = {b3Var, b3Var2, b3Var3, b3Var4, b3Var5, b3Var6, b3Var7, b3Var8, b3Var9, b3Var10};
        f13119m = b3VarArr;
        qf.a.a(b3VarArr);
    }

    public b3(String str, int i10, Stats.AdUnitRequestResult adUnitRequestResult) {
        this.f13120b = adUnitRequestResult;
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) f13119m.clone();
    }
}
