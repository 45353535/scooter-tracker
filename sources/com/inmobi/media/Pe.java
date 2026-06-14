package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pe f37540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pe f37541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pe f37542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pe f37543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Pe[] f37544e;

    static {
        Pe pe2 = new Pe("UNAVAILABLE", 0);
        f37540a = pe2;
        Pe pe3 = new Pe("SLOW", 1);
        f37541b = pe3;
        Pe pe4 = new Pe("MEDIUM", 2);
        f37542c = pe4;
        Pe pe5 = new Pe("FAST", 3);
        f37543d = pe5;
        Pe[] peArr = {pe2, pe3, pe4, pe5};
        f37544e = peArr;
        qf.a.a(peArr);
    }

    public Pe(String str, int i10) {
    }

    public static Pe valueOf(String str) {
        return (Pe) Enum.valueOf(Pe.class, str);
    }

    public static Pe[] values() {
        return (Pe[]) f37544e.clone();
    }
}
