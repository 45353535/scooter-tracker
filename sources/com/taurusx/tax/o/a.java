package com.taurusx.tax.o;

import com.ironsource.C4240b4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f66401a = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66402f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66403g = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f66404m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f66405n = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f66406p = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f66407t = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66408c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f66409o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f66410s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f66411w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f66412y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f66413z;

    public a() {
        this(0, 0, 0, 0, 2, true);
    }

    public static int z(String str) {
        int iIndexOf = Arrays.asList(C4240b4.e.f42563c, "top-center", C4240b4.e.f42562b, "center", C4240b4.e.f42565e, "bottom-center", C4240b4.e.f42564d).indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        return 2;
    }

    public a(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f66413z = i10;
        this.f66411w = i11;
        this.f66412y = i12;
        this.f66408c = i13;
        this.f66409o = i14;
        this.f66410s = z10;
    }
}
