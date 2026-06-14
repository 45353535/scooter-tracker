package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ab f36561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ab f36562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ab f36563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ab f36564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Ab[] f36565e;

    static {
        Ab ab2 = new Ab("INFO", 0);
        f36561a = ab2;
        Ab ab3 = new Ab("DEBUG", 1);
        f36562b = ab3;
        Ab ab4 = new Ab("ERROR", 2);
        f36563c = ab4;
        Ab ab5 = new Ab("STATE", 3);
        f36564d = ab5;
        Ab[] abArr = {ab2, ab3, ab4, ab5};
        f36565e = abArr;
        qf.a.a(abArr);
    }

    public Ab(String str, int i10) {
    }

    public static Ab valueOf(String str) {
        return (Ab) Enum.valueOf(Ab.class, str);
    }

    public static Ab[] values() {
        return (Ab[]) f36565e.clone();
    }
}
