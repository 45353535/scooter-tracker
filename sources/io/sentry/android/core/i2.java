package io.sentry.android.core;

import io.sentry.android.core.internal.util.f0;
import io.sentry.f3;
import io.sentry.h3;
import io.sentry.n7;
import io.sentry.s5;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class i2 implements io.sentry.v0, f0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f82463h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final n7 f82464i = new n7(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f82465a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.f0 f82467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f82468d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.a f82466b = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SortedSet f82469e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.h2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return i2.f((io.sentry.j1) obj, (io.sentry.j1) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentSkipListSet f82470f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f82471g = 16666666;

    private static class a implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f82472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f82473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f82474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f82475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f82476f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f82477g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f82478h;

        a(long j10) {
            this(j10, j10, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f82473c, aVar.f82473c);
        }

        a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, long j14) {
            this.f82472b = j10;
            this.f82473c = j11;
            this.f82474d = j12;
            this.f82475e = j13;
            this.f82476f = z10;
            this.f82477g = z11;
            this.f82478h = j14;
        }
    }

    public i2(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.f0 f0Var) {
        this.f82467c = f0Var;
        this.f82465a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        if (j1Var == j1Var2) {
            return 0;
        }
        int iCompareTo = j1Var.r().compareTo(j1Var2.r());
        return iCompareTo != 0 ? iCompareTo : j1Var.e().m().toString().compareTo(j1Var2.e().m().toString());
    }

    private static int g(g2 g2Var, long j10, long j11, long j12) {
        long jMax = Math.max(0L, j11 - j12);
        if (!io.sentry.android.core.internal.util.f0.j(jMax, j10)) {
            return 0;
        }
        g2Var.a(jMax, Math.max(0L, jMax - j10), true, io.sentry.android.core.internal.util.f0.i(jMax));
        return 1;
    }

    private void h(io.sentry.j1 j1Var) {
        io.sentry.g1 g1VarD = this.f82466b.d();
        try {
            if (!this.f82469e.remove(j1Var)) {
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            s5 s5VarQ = j1Var.q();
            if (s5VarQ == null) {
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            long j10 = j(j1Var.r());
            long j11 = j(s5VarQ);
            long j12 = j11 - j10;
            long j13 = 0;
            if (j12 <= 0) {
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            g2 g2Var = new g2();
            long j14 = this.f82471g;
            if (!this.f82470f.isEmpty()) {
                for (a aVar : this.f82470f.tailSet(new a(j10))) {
                    if (aVar.f82472b > j11) {
                        break;
                    }
                    if (aVar.f82472b >= j10 && aVar.f82473c <= j11) {
                        g2Var.a(aVar.f82474d, aVar.f82475e, aVar.f82476f, aVar.f82477g);
                    } else if ((j10 > aVar.f82472b && j10 < aVar.f82473c) || (j11 > aVar.f82472b && j11 < aVar.f82473c)) {
                        long jMin = Math.min(aVar.f82475e - Math.max(j13, Math.max(j13, j10 - aVar.f82472b) - aVar.f82478h), j12);
                        long jMin2 = Math.min(j11, aVar.f82473c) - Math.max(j10, aVar.f82472b);
                        g2Var.a(jMin2, jMin, io.sentry.android.core.internal.util.f0.j(jMin2, aVar.f82478h), io.sentry.android.core.internal.util.f0.i(jMin2));
                    }
                    j14 = aVar.f82478h;
                    j13 = 0;
                }
            }
            long j15 = j14;
            int iF = g2Var.f();
            long jH = this.f82467c.h();
            if (jH != -1) {
                iF = iF + g(g2Var, j15, j11, jH) + i(g2Var, j15, j12);
            }
            double dE = (g2Var.e() + g2Var.c()) / 1.0E9d;
            j1Var.k("frames.total", Integer.valueOf(iF));
            j1Var.k("frames.slow", Integer.valueOf(g2Var.d()));
            j1Var.k("frames.frozen", Integer.valueOf(g2Var.b()));
            j1Var.k("frames.delay", Double.valueOf(dE));
            if (j1Var instanceof io.sentry.l1) {
                j1Var.i("frames_total", Integer.valueOf(iF));
                j1Var.i("frames_slow", Integer.valueOf(g2Var.d()));
                j1Var.i("frames_frozen", Integer.valueOf(g2Var.b()));
                j1Var.i("frames_delay", Double.valueOf(dE));
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD == null) {
                throw th2;
            }
            try {
                g1VarD.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static int i(g2 g2Var, long j10, long j11) {
        long jG = j11 - g2Var.g();
        if (jG > 0) {
            return (int) Math.ceil(jG / j10);
        }
        return 0;
    }

    private static long j(s5 s5Var) {
        if (s5Var instanceof n7) {
            return s5Var.c(f82464i);
        }
        return System.nanoTime() - (io.sentry.l.i(System.currentTimeMillis()) - s5Var.g());
    }

    @Override // io.sentry.v0
    public void a(io.sentry.j1 j1Var) {
        if (!this.f82465a || (j1Var instanceof f3) || (j1Var instanceof h3)) {
            return;
        }
        io.sentry.g1 g1VarD = this.f82466b.d();
        try {
            if (!this.f82469e.contains(j1Var)) {
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            h(j1Var);
            g1VarD = this.f82466b.d();
            try {
                if (this.f82469e.isEmpty()) {
                    clear();
                } else {
                    this.f82470f.headSet(new a(j(((io.sentry.j1) this.f82469e.first()).r()))).clear();
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
        }
    }

    @Override // io.sentry.v0
    public void b(io.sentry.j1 j1Var) {
        if (!this.f82465a || (j1Var instanceof f3) || (j1Var instanceof h3)) {
            return;
        }
        io.sentry.g1 g1VarD = this.f82466b.d();
        try {
            this.f82469e.add(j1Var);
            if (this.f82468d == null) {
                this.f82468d = this.f82467c.l(this);
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

    @Override // io.sentry.v0
    public void clear() {
        io.sentry.g1 g1VarD = this.f82466b.d();
        try {
            if (this.f82468d != null) {
                this.f82467c.m(this.f82468d);
                this.f82468d = null;
            }
            this.f82470f.clear();
            this.f82469e.clear();
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

    @Override // io.sentry.android.core.internal.util.f0.b
    public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
        if (this.f82470f.size() > 3600) {
            return;
        }
        long j14 = (long) (f82463h / ((double) f10));
        this.f82471g = j14;
        if (z10 || z11) {
            this.f82470f.add(new a(j10, j11, j12, j13, z10, z11, j14));
        }
    }
}
