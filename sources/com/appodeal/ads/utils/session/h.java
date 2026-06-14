package com.appodeal.ads.utils.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f15076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f15077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h[] f15078d;

    static {
        h hVar = new h("ReadyToUse", 0);
        f15076b = hVar;
        h hVar2 = new h("NeedToStartNew", 1);
        f15077c = hVar2;
        h[] hVarArr = {hVar, hVar2};
        f15078d = hVarArr;
        qf.a.a(hVarArr);
    }

    public h(String str, int i10) {
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f15078d.clone();
    }
}
