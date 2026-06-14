package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Df f36734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Df f36735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Df f36736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Df f36737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Df[] f36738e;

    static {
        Df df2 = new Df("PORTRAIT", 0);
        f36734a = df2;
        Df df3 = new Df("LANDSCAPE", 1);
        f36735b = df3;
        Df df4 = new Df("REVERSE_PORTRAIT", 2);
        f36736c = df4;
        Df df5 = new Df("REVERSE_LANDSCAPE", 3);
        f36737d = df5;
        Df[] dfArr = {df2, df3, df4, df5};
        f36738e = dfArr;
        qf.a.a(dfArr);
    }

    public Df(String str, int i10) {
    }

    public static Df valueOf(String str) {
        return (Df) Enum.valueOf(Df.class, str);
    }

    public static Df[] values() {
        return (Df[]) f36738e.clone();
    }
}
