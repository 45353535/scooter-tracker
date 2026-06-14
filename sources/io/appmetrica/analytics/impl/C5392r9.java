package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5392r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4991bf f78127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo f78128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Wk f78129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S6 f78130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M8 f78131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ok f78132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5182j0 f78133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y8 f78134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5110g5 f78135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeProvider f78136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f78137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f78139m;

    public C5392r9(C4991bf c4991bf, zo zoVar, Wk wk, S6 s62, C5182j0 c5182j0, M8 m82, Ok ok, int i10, C5110g5 c5110g5, Y8 y82, SystemTimeProvider systemTimeProvider) {
        this.f78127a = c4991bf;
        this.f78128b = zoVar;
        this.f78129c = wk;
        this.f78130d = s62;
        this.f78133g = c5182j0;
        this.f78131e = m82;
        this.f78132f = ok;
        this.f78137k = i10;
        this.f78134h = y82;
        this.f78136j = systemTimeProvider;
        this.f78135i = c5110g5;
        this.f78138l = c4991bf.i();
        this.f78139m = c4991bf.h();
    }

    public final void a(W5 w52, Yk yk) {
        Map map = w52.f76629p;
        Ok ok = this.f78132f;
        ok.getClass();
        map.putAll(new HashMap(ok.f76208b));
        w52.c(this.f78127a.j());
        w52.f76628o = Integer.valueOf(this.f78128b.b());
        C5157i0 c5157i0A = this.f78133g.a();
        M8 m82 = this.f78131e;
        m82.getClass();
        L8 l82 = (L8) m82.f76121b.a(EnumC5168ib.a(w52.f76617d));
        S6 s62 = this.f78130d;
        E8 e8A = l82.a(w52);
        int i10 = w52.f76617d;
        Y8 y82 = this.f78134h;
        C5341p7 c5341p7 = new C5341p7(s62.f76400g, yk, i10, y82, e8A, (C5351ph) s62.f76401h.f77072k.a(), c5157i0A);
        Long lValueOf = Long.valueOf(yk.f76719a);
        EnumC4971al enumC4971al = yk.f76722d;
        Long lValueOf2 = Long.valueOf(yk.f76720b);
        EnumC5168ib enumC5168ibA = EnumC5168ib.a(c5341p7.f77969h.f76617d);
        long jOptLong = 0;
        if (!D9.f75663g.contains(EnumC5168ib.a(i10))) {
            zo zoVar = y82.f76701b;
            synchronized (zoVar) {
                jOptLong = zoVar.f78664a.a().optLong("global_number", 0L);
            }
            y82.f76701b.b(1 + jOptLong);
        }
        s62.a(s62.f76405l.fromModel(new C5266m7(lValueOf, enumC4971al, lValueOf2, enumC5168ibA, Long.valueOf(jOptLong), Long.valueOf(yk.f76721c), c5341p7.a())));
        this.f78135i.f77209a.h();
    }
}
