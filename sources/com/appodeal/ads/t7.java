package com.appodeal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public class t7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t7 f14865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t7 f14866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a7 f14867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o7 f14868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t7 f14869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ t7[] f14870i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14872c;

    static {
        t7 t7Var = new t7("BOTTOM", 0, 81);
        f14865d = t7Var;
        t7 t7Var2 = new t7("TOP", 1, 49);
        f14866e = t7Var2;
        a7 a7Var = new a7();
        f14867f = a7Var;
        o7 o7Var = new o7();
        f14868g = o7Var;
        t7 t7Var3 = new t7("VIEW", 4, 17);
        f14869h = t7Var3;
        f14870i = new t7[]{t7Var, t7Var2, a7Var, o7Var, t7Var3};
    }

    public t7(String str, int i10, int i11) {
        this.f14871b = i11;
        this.f14872c = i11;
    }

    public static t7 valueOf(String str) {
        return (t7) Enum.valueOf(t7.class, str);
    }

    public static t7[] values() {
        return (t7[]) f14870i.clone();
    }

    public int d() {
        return 0;
    }

    public t7(String str, int i10, int i11, int i12) {
        this.f14871b = 17;
        this.f14872c = i11;
    }
}
