package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class bi2 implements jl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30 f109014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th2 f109015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oj0 f109016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fe1 f109017d;

    public bi2(b30 b30Var, final cp0 cp0Var) {
        this(b30Var, new th2() { // from class: yads.n3
            @Override // yads.th2
            public final tq a(wc2 wc2Var) {
                return bi2.a(cp0Var, wc2Var);
            }
        });
    }

    public static /* synthetic */ tq a(cp0 cp0Var, wc2 wc2Var) {
        return new tq(cp0Var);
    }

    @Override // yads.jl1
    public final ml1 createMediaSource(rk1 rk1Var) {
        rk1Var.f115475c.getClass();
        Object obj = rk1Var.f115475c.f113137g;
        return new ci2(rk1Var, this.f109014a, this.f109015b, ((uc0) this.f109016c).a(rk1Var), this.f109017d, 1048576);
    }

    @Override // yads.jl1
    public final jl1 setDrmSessionManagerProvider(oj0 oj0Var) {
        if (oj0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f109016c = oj0Var;
        return this;
    }

    @Override // yads.jl1
    public final jl1 setLoadErrorHandlingPolicy(fe1 fe1Var) {
        if (fe1Var == null) {
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f109017d = fe1Var;
        return this;
    }

    public bi2(b30 b30Var, th2 th2Var) {
        this(b30Var, th2Var, new uc0(), new ld0());
    }

    public bi2(b30 b30Var, th2 th2Var, uc0 uc0Var, ld0 ld0Var) {
        this.f109014a = b30Var;
        this.f109015b = th2Var;
        this.f109016c = uc0Var;
        this.f109017d = ld0Var;
    }
}
