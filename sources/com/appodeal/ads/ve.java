package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ze f15160a = new ze();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static fe f15161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static be f15162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ud f15163d;

    public static be a() {
        be beVar;
        be beVar2 = f15162c;
        if (beVar2 != null) {
            return beVar2;
        }
        synchronized (l0.class) {
            try {
                beVar = f15162c;
                if (beVar == null) {
                    beVar = new be(b());
                    f15162c = beVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return beVar;
    }

    public static fe b() {
        if (f15161b == null) {
            f15161b = new fe();
        }
        return f15161b;
    }

    public static ud c() {
        if (f15163d == null) {
            f15163d = new ud();
        }
        return f15163d;
    }
}
