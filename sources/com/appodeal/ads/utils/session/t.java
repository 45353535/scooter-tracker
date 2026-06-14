package com.appodeal.ads.utils.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f15111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f15112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f15113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t[] f15114e;

    static {
        t tVar = new t("NotInitialized", 0);
        f15111b = tVar;
        t tVar2 = new t("Idle", 1);
        f15112c = tVar2;
        t tVar3 = new t("Reporting", 2);
        f15113d = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
        f15114e = tVarArr;
        qf.a.a(tVarArr);
    }

    public t(String str, int i10) {
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f15114e.clone();
    }
}
