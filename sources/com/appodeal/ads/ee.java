package com.appodeal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qe f13289a = new qe();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13290b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13291c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static td f13292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static id f13293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static dd f13294f;

    public static id a() {
        id idVar;
        id idVar2 = f13293e;
        if (idVar2 != null) {
            return idVar2;
        }
        synchronized (l0.class) {
            try {
                idVar = f13293e;
                if (idVar == null) {
                    idVar = new id(c());
                    f13293e = idVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return idVar;
    }

    public static boolean b(Context context) {
        return f13291c && j2.C(context) && j2.z(context) >= 728.0f;
    }

    public static td c() {
        if (f13292d == null) {
            f13292d = new td();
        }
        return f13292d;
    }

    public static dd d() {
        if (f13294f == null) {
            f13294f = new dd();
        }
        return f13294f;
    }
}
