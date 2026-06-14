package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hn f37034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hn f37035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hn f37036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Hn[] f37037d;

    static {
        Hn hn = new Hn("UNKNOWN", 0);
        f37034a = hn;
        Hn hn2 = new Hn("HIDDEN", 1);
        f37035b = hn2;
        Hn hn3 = new Hn("VISIBLE", 2);
        f37036c = hn3;
        Hn[] hnArr = {hn, hn2, hn3};
        f37037d = hnArr;
        qf.a.a(hnArr);
    }

    public Hn(String str, int i10) {
    }

    public static Hn valueOf(String str) {
        return (Hn) Enum.valueOf(Hn.class, str);
    }

    public static Hn[] values() {
        return (Hn[]) f37037d.clone();
    }
}
