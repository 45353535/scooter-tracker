package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.g7;
import io.sentry.util.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.util.q f82428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f82429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f82430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f82431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1 f82432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected io.sentry.util.a f82433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.q f82434g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f82435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f82436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f82437c;

        private b(int i10, int i11, int i12) {
            this.f82435a = i10;
            this.f82436b = i11;
            this.f82437c = i12;
        }
    }

    public i(io.sentry.util.t tVar, SentryAndroidOptions sentryAndroidOptions, t1 t1Var) {
        this.f82430c = new ConcurrentHashMap();
        this.f82431d = new WeakHashMap();
        this.f82433f = new io.sentry.util.a();
        this.f82434g = tVar.e("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.f82428a = new io.sentry.util.q(new q.a() { // from class: io.sentry.android.core.d
            @Override // io.sentry.util.q.a
            public final Object a() {
                return i.e();
            }
        });
        this.f82429b = sentryAndroidOptions;
        this.f82432e = t1Var;
    }

    public static /* synthetic */ void c(i iVar, Runnable runnable, String str) {
        iVar.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                iVar.f82429b.getLogger().c(g7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public static /* synthetic */ FrameMetricsAggregator e() {
        return new FrameMetricsAggregator();
    }

    private b g() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!i() || !((Boolean) this.f82434g.a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] metrics = ((FrameMetricsAggregator) this.f82428a.a()).getMetrics();
        int i12 = 0;
        if (metrics == null || metrics.length <= 0 || (sparseIntArray = metrics[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                } else if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new b(i12, i10, i11);
    }

    private b h(Activity activity) {
        b bVarG;
        b bVar = (b) this.f82431d.remove(activity);
        if (bVar == null || (bVarG = g()) == null) {
            return null;
        }
        return new b(bVarG.f82435a - bVar.f82435a, bVarG.f82436b - bVar.f82436b, bVarG.f82437c - bVar.f82437c);
    }

    private void j(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.l.e().a()) {
                runnable.run();
            } else {
                this.f82432e.b(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.c(this.f82411b, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f82429b.getLogger().c(g7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void l(Activity activity) {
        b bVarG = g();
        if (bVarG != null) {
            this.f82431d.put(activity, bVarG);
        }
    }

    public void f(final Activity activity) {
        io.sentry.g1 g1VarD = this.f82433f.d();
        try {
            if (!i()) {
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } else {
                j(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((FrameMetricsAggregator) this.f82401b.f82428a.a()).add(activity);
                    }
                }, "FrameMetricsAggregator.add");
                l(activity);
                if (g1VarD != null) {
                    g1VarD.close();
                }
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public boolean i() {
        return ((Boolean) this.f82434g.a()).booleanValue() && this.f82429b.isEnableFramesTracking() && !this.f82429b.isEnablePerformanceV2();
    }

    public void k(final Activity activity, io.sentry.protocol.x xVar) {
        io.sentry.g1 g1VarD = this.f82433f.d();
        try {
            if (!i()) {
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            j(new Runnable() { // from class: io.sentry.android.core.h
                @Override // java.lang.Runnable
                public final void run() {
                    ((FrameMetricsAggregator) this.f82420b.f82428a.a()).remove(activity);
                }
            }, null);
            b bVarH = h(activity);
            if (bVarH != null && (bVarH.f82435a != 0 || bVarH.f82436b != 0 || bVarH.f82437c != 0)) {
                io.sentry.protocol.k kVar = new io.sentry.protocol.k(Integer.valueOf(bVarH.f82435a), "none");
                io.sentry.protocol.k kVar2 = new io.sentry.protocol.k(Integer.valueOf(bVarH.f82436b), "none");
                io.sentry.protocol.k kVar3 = new io.sentry.protocol.k(Integer.valueOf(bVarH.f82437c), "none");
                HashMap map = new HashMap();
                map.put("frames_total", kVar);
                map.put("frames_slow", kVar2);
                map.put("frames_frozen", kVar3);
                this.f82430c.put(xVar, map);
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void m() {
        io.sentry.g1 g1VarD = this.f82433f.d();
        try {
            if (i()) {
                j(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((FrameMetricsAggregator) this.f82406b.f82428a.a()).stop();
                    }
                }, "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) this.f82428a.a()).reset();
            }
            this.f82430c.clear();
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Map n(io.sentry.protocol.x xVar) {
        io.sentry.g1 g1VarD = this.f82433f.d();
        try {
            if (!i()) {
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return null;
            }
            Map map = (Map) this.f82430c.get(xVar);
            this.f82430c.remove(xVar);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return map;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public i(io.sentry.util.t tVar, SentryAndroidOptions sentryAndroidOptions) {
        this(tVar, sentryAndroidOptions, new t1());
    }
}
