package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public abstract class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef f12643a = new ef();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f12644b = 90000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static we f12645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static se f12646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static q3 f12647e;

    public static se a() {
        se seVar;
        se seVar2 = f12646d;
        if (seVar2 != null) {
            return seVar2;
        }
        synchronized (l0.class) {
            try {
                seVar = f12646d;
                if (seVar == null) {
                    seVar = new se(b());
                    f12646d = seVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return seVar;
    }

    public static we b() {
        if (f12645c == null) {
            f12645c = new we();
        }
        return f12645c;
    }
}
