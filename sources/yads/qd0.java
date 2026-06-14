package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class qd0 implements jl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd0 f114942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b30 f114943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fe1 f114944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f114945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f114946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f114947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f114948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f114949h;

    public qd0(b30 b30Var, bd0 bd0Var) {
        this.f114943b = b30Var;
        pd0 pd0Var = new pd0(bd0Var);
        this.f114942a = pd0Var;
        pd0Var.b(b30Var);
        this.f114945d = -9223372036854775807L;
        this.f114946e = -9223372036854775807L;
        this.f114947f = -9223372036854775807L;
        this.f114948g = -3.4028235E38f;
        this.f114949h = -3.4028235E38f;
    }

    public static jl1 a(Class cls, b30 b30Var) {
        try {
            return (jl1) cls.getConstructor(b30.class).newInstance(b30Var);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // yads.jl1
    public final ml1 createMediaSource(rk1 rk1Var) {
        rk1 rk1VarA = rk1Var;
        rk1VarA.f115475c.getClass();
        String scheme = rk1VarA.f115475c.f113131a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        mk1 mk1Var = rk1VarA.f115475c;
        int iA = w83.a(mk1Var.f113131a, mk1Var.f113132b);
        pd0 pd0Var = this.f114942a;
        jl1 jl1Var = (jl1) pd0Var.f114627d.get(Integer.valueOf(iA));
        if (jl1Var == null) {
            k23 k23VarA = pd0Var.a(iA);
            if (k23VarA == null) {
                jl1Var = null;
            } else {
                jl1Var = (jl1) k23VarA.get();
                oj0 oj0Var = pd0Var.f114629f;
                if (oj0Var != null) {
                    jl1Var.setDrmSessionManagerProvider(oj0Var);
                }
                fe1 fe1Var = pd0Var.f114630g;
                if (fe1Var != null) {
                    jl1Var.setLoadErrorHandlingPolicy(fe1Var);
                }
                pd0Var.f114627d.put(Integer.valueOf(iA), jl1Var);
            }
        }
        fi.a(jl1Var, "No suitable media source factory found for content type: " + iA);
        kk1 kk1Var = rk1VarA.f115476d;
        kk1Var.getClass();
        long j10 = kk1Var.f112731b;
        long j11 = kk1Var.f112732c;
        long j12 = kk1Var.f112733d;
        float f10 = kk1Var.f112734e;
        float f11 = kk1Var.f112735f;
        kk1 kk1Var2 = rk1VarA.f115476d;
        if (kk1Var2.f112731b == -9223372036854775807L) {
            j10 = this.f114945d;
        }
        long j13 = j10;
        if (kk1Var2.f112734e == -3.4028235E38f) {
            f10 = this.f114948g;
        }
        float f12 = f10;
        if (kk1Var2.f112735f == -3.4028235E38f) {
            f11 = this.f114949h;
        }
        float f13 = f11;
        if (kk1Var2.f112732c == -9223372036854775807L) {
            j11 = this.f114946e;
        }
        long j14 = j11;
        if (kk1Var2.f112733d == -9223372036854775807L) {
            j12 = this.f114947f;
        }
        kk1 kk1Var3 = new kk1(j13, j14, j12, f12, f13);
        if (!kk1Var3.equals(rk1VarA.f115476d)) {
            dk1 dk1VarA = rk1VarA.a();
            dk1VarA.f109953k = new jk1(kk1Var3);
            rk1VarA = dk1VarA.a();
        }
        ml1 ml1VarCreateMediaSource = jl1Var.createMediaSource(rk1VarA);
        y31 y31Var = rk1VarA.f115475c.f113136f;
        if (!y31Var.isEmpty()) {
            ml1[] ml1VarArr = new ml1[y31Var.size() + 1];
            ml1VarArr[0] = ml1VarCreateMediaSource;
            int i10 = 0;
            while (i10 < y31Var.size()) {
                b30 b30Var = this.f114943b;
                b30Var.getClass();
                fe1 ld0Var = new ld0(0);
                fe1 fe1Var2 = this.f114944c;
                if (fe1Var2 != null) {
                    ld0Var = fe1Var2;
                }
                int i11 = i10 + 1;
                androidx.privacysandbox.ads.adservices.topics.a.a(y31Var.get(i10));
                ml1VarArr[i11] = new gx2(null, b30Var, ld0Var, true);
                i10 = i11;
            }
            ml1VarCreateMediaSource = new cr1(ml1VarArr, 0);
        }
        ml1 gvVar = ml1VarCreateMediaSource;
        gk1 gk1Var = rk1VarA.f115478f;
        long j15 = gk1Var.f110745b;
        if (j15 != 0 || gk1Var.f110746c != Long.MIN_VALUE || gk1Var.f110748e) {
            long jA = w83.a(j15);
            long jA2 = w83.a(rk1VarA.f115478f.f110746c);
            gk1 gk1Var2 = rk1VarA.f115478f;
            gvVar = new gv(gvVar, jA, jA2, !gk1Var2.f110749f, gk1Var2.f110747d, gk1Var2.f110748e);
        }
        rk1VarA.f115475c.getClass();
        rk1VarA.f115475c.getClass();
        return gvVar;
    }

    @Override // yads.jl1
    public final jl1 setDrmSessionManagerProvider(oj0 oj0Var) {
        pd0 pd0Var = this.f114942a;
        if (oj0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        pd0Var.f114629f = oj0Var;
        Iterator it = pd0Var.f114627d.values().iterator();
        while (it.hasNext()) {
            ((jl1) it.next()).setDrmSessionManagerProvider(oj0Var);
        }
        return this;
    }

    @Override // yads.jl1
    public final jl1 setLoadErrorHandlingPolicy(fe1 fe1Var) {
        if (fe1Var == null) {
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f114944c = fe1Var;
        pd0 pd0Var = this.f114942a;
        pd0Var.f114630g = fe1Var;
        Iterator it = pd0Var.f114627d.values().iterator();
        while (it.hasNext()) {
            ((jl1) it.next()).setLoadErrorHandlingPolicy(fe1Var);
        }
        return this;
    }
}
