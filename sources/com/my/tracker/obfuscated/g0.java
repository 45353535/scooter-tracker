package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile g0 f61519l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f61520a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f61521b = new y0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f61522c = new a0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0 f61523d = new l0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u0 f61524e = new u0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i1 f61525f = new i1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a1 f61526g = new a1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k f61527h = new k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f61528i = new d0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f61529j = new p();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i0 f61530k = new i0();

    private g0() {
    }

    public static g0 a() {
        g0 g0Var;
        g0 g0Var2 = f61519l;
        if (g0Var2 != null) {
            return g0Var2;
        }
        synchronized (g0.class) {
            try {
                g0Var = f61519l;
                if (g0Var == null) {
                    g0Var = new g0();
                    f61519l = g0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    public f0 a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z10, int i10, boolean z11, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        c0 c0VarB;
        c0 c0Var;
        h0 h0VarA;
        x0 x0VarA;
        z0 z0VarA;
        k0 k0Var;
        t0 t0Var;
        g gVarA = this.f61520a.a(context);
        z zVarA = this.f61522c.a(context);
        h1 h1VarA = this.f61525f.a(context);
        j jVarA = this.f61527h.a(installedPackagesProvider, context);
        if (z11) {
            c0Var = c0.f61298c;
            z0VarA = z0.f61984g;
            x0VarA = null;
            k0Var = null;
            t0Var = null;
            h0VarA = null;
        } else {
            t0 t0VarA = this.f61524e.a(context);
            k0 k0VarA = this.f61523d.a(context);
            if (z10) {
                c0VarB = this.f61528i.b(context);
            } else {
                c0VarB = c0.f61298c;
            }
            c0Var = c0VarB;
            h0VarA = this.f61530k.a(context);
            x0VarA = this.f61521b.a(str, okHttpClientProvider);
            z0VarA = this.f61526g.a(i10, context);
            k0Var = k0VarA;
            t0Var = t0VarA;
        }
        return new f0(gVarA, x0VarA, zVarA, k0Var, t0Var, h1VarA, z0VarA, jVarA, c0Var, this.f61529j.a(context), h0VarA);
    }
}
