package com.my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes11.dex */
public class aa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59150c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f59174a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f59175b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f59151d = a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f59152e = a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f59153f = a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f59154g = a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f59155h = a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f59156i = a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f59157j = a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f59158k = a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f59159l = a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f59160m = a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f59161n = a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f59162o = a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f59163p = a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f59164q = a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f59165r = a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f59166s = a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f59167t = a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f59168u = a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f59169v = a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f59170w = a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f59171x = a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f59172y = a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f59173z = a();
    public static final int A = a();
    public static final int B = a();
    public static final int C = a();
    public static final int D = a();
    public static final int E = a();
    public static final int F = a();
    public static final int G = a();
    public static final int H = a();
    public static final int I = a();
    public static final int J = a();
    public static final int K = a();
    public static final int L = a();
    public static final int M = a();
    public static final int N = a();
    public static final int O = a();
    public static final int P = a();
    public static final int Q = a();
    public static final int R = a();
    public static final int S = a();
    public static final int T = a();
    public static final int U = a();
    public static final int V = a();
    public static final int W = a();
    public static final int X = a();
    public static final int Y = a();

    public aa(Context context) {
        int i10;
        kb kbVarE = kb.e(context);
        DisplayMetrics displayMetricsA = kb.a(context);
        int i11 = displayMetricsA.heightPixels;
        if (i11 <= 0 || (i10 = displayMetricsA.widthPixels) <= 0) {
            this.f59175b = 1.0f;
            a(kbVarE);
            return;
        }
        float f10 = displayMetricsA.density;
        float fMin = Math.min(i10 / f10, i11 / f10);
        if (fMin >= 720.0f) {
            this.f59175b = 2.0f;
        } else if (fMin >= 600.0f) {
            this.f59175b = 1.2f;
        } else {
            this.f59175b = 1.0f;
        }
        a(kbVarE);
    }

    public static aa a(Context context) {
        return new aa(context);
    }

    public static int a() {
        int i10 = f59150c;
        f59150c = i10 + 1;
        return i10;
    }

    public int a(int i10) {
        return this.f59174a.get(i10);
    }

    public final void a(kb kbVar) {
        a(f59151d, kbVar.b(200));
        a(f59152e, kbVar.b(1));
        a(f59153f, kbVar.b(4));
        a(f59154g, 1);
        a(f59155h, 18);
        a(f59156i, kbVar.b(16));
        a(f59157j, kbVar.b(8));
        a(f59158k, kbVar.b(6));
        a(f59159l, kbVar.b(2));
        a(f59160m, kbVar.b(48));
        a(f59161n, kbVar.b(6));
        a(f59162o, kbVar.b(6));
        a(f59163p, kbVar.b(14));
        a(f59164q, kbVar.b(20));
        a(f59165r, kbVar.b(27));
        a(f59166s, 22);
        a(f59167t, 2);
        a(f59168u, 16);
        a(f59169v, 3);
        a(f59170w, 16);
        a(f59171x, kbVar.b(6));
        a(f59172y, kbVar.b(2));
        a(f59173z, 1);
        a(A, kbVar.b(3));
        a(C, 16);
        a(X, 14);
        a(B, 1);
        a(D, 2);
        a(E, 2);
        a(F, kbVar.b(32));
        a(G, kbVar.b(16));
        a(I, kbVar.b(2));
        a(J, 16);
        a(L, 16);
        a(M, 2);
        a(N, 14);
        a(K, 22);
        a(Q, 16);
        a(R, 16);
        a(O, kbVar.b(4));
        a(P, kbVar.b(8));
        a(S, kbVar.b(100));
        a(T, kbVar.b(32));
        a(U, kbVar.b(136));
        a(V, kbVar.b(156));
        a(H, kbVar.b(24));
        a(W, kbVar.b(10));
        a(Y, kbVar.b(40));
    }

    public final void a(int i10, int i11) {
        this.f59174a.put(i10, (int) (i11 * this.f59175b));
    }
}
