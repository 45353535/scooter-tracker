package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Mn f37387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Mn f37388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Mn[] f37389c;

    static {
        Mn mn = new Mn("HIDDEN", 0);
        f37387a = mn;
        Mn mn2 = new Mn("VISIBLE", 1);
        f37388b = mn2;
        Mn[] mnArr = {mn, mn2};
        f37389c = mnArr;
        qf.a.a(mnArr);
    }

    public Mn(String str, int i10) {
    }

    public static Mn valueOf(String str) {
        return (Mn) Enum.valueOf(Mn.class, str);
    }

    public static Mn[] values() {
        return (Mn[]) f37389c.clone();
    }
}
