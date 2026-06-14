package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5468ua {
    public static volatile C5468ua H;
    public volatile T9 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C5375qg f78353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile L6 f78354c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Z2 f78356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C5402rj f78357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile U f78358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile C5184j2 f78359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f78360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile C5573yf f78361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile H3 f78362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile C5068ef f78363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Co f78364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile C5201jj f78365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Mb f78366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public El f78367p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Ck f78369r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Rb f78374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile C5382qn f78375x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile C5554xl f78376y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile Cd f78377z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C5443ta f78368q = new C5443ta();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Zc f78370s = new Zc();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C4989bd f78371t = new C4989bd();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C5256lm f78372u = new C5256lm();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C5202jk f78373v = new C5202jk();
    public final Vd A = new Vd();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C5379qk D = new C5379qk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final Bk F = new Bk();
    public final C5181j G = new C5181j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5329ok f78355d = new C5329ok();

    public C5468ua(Context context) {
        this.f78352a = context;
    }

    public static void a(Context context) {
        if (H == null) {
            synchronized (C5468ua.class) {
                try {
                    if (H == null) {
                        H = new C5468ua(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static C5468ua k() {
        return H;
    }

    public final synchronized S2 A() {
        try {
            if (this.f78367p == null) {
                El el = new El(this.f78352a);
                this.f78367p = el;
                this.f78372u.a(el);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78367p;
    }

    public final C5256lm B() {
        return this.f78372u;
    }

    public final C5382qn C() {
        C5382qn c5382qn;
        C5382qn c5382qn2 = this.f78375x;
        if (c5382qn2 != null) {
            return c5382qn2;
        }
        synchronized (this) {
            try {
                c5382qn = this.f78375x;
                if (c5382qn == null) {
                    c5382qn = new C5382qn(this.f78352a);
                    this.f78375x = c5382qn;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5382qn;
    }

    public final synchronized Co D() {
        try {
            if (this.f78364m == null) {
                this.f78364m = new Co(this.f78352a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78364m;
    }

    public final void E() {
        if (this.f78361j == null) {
            synchronized (this) {
                try {
                    if (this.f78361j == null) {
                        Um umA = Tm.a(Cif.class);
                        Context context = this.f78352a;
                        Vm vm = (Vm) umA;
                        ProtobufStateStorage<Object> protobufStateStorageA = vm.a(context, vm.a(context));
                        Cif cif = (Cif) protobufStateStorageA.read();
                        this.f78361j = new C5573yf(this.f78352a, protobufStateStorageA, new C5349pf(), new C5120gf(cif), new C5548xf(), new C5324of(this.f78352a), new C5448tf(k().z()), new C5197jf(), cif, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final C5181j b() {
        return this.G;
    }

    public final U c() {
        U u10;
        U u11 = this.f78358g;
        if (u11 != null) {
            return u11;
        }
        synchronized (this) {
            try {
                u10 = this.f78358g;
                if (u10 == null) {
                    u10 = new U(this.f78352a, this.f78355d.a(), this.f78372u.b());
                    this.f78372u.a(u10);
                    this.f78358g = u10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u10;
    }

    public final C5184j2 d() {
        C5184j2 c5184j2;
        C5184j2 c5184j22 = this.f78359h;
        if (c5184j22 != null) {
            return c5184j22;
        }
        synchronized (this) {
            try {
                c5184j2 = this.f78359h;
                if (c5184j2 == null) {
                    c5184j2 = new C5184j2(this.f78352a, AbstractC5210k2.a());
                    this.f78359h = c5184j2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5184j2;
    }

    public final C5336p2 e() {
        return l().f76123b;
    }

    public final H3 f() {
        if (this.f78362k == null) {
            synchronized (this) {
                try {
                    if (this.f78362k == null) {
                        Um umA = Tm.a(A3.class);
                        Context context = this.f78352a;
                        Vm vm = (Vm) umA;
                        ProtobufStateStorage<Object> protobufStateStorageA = vm.a(context, vm.a(context));
                        this.f78362k = new H3(this.f78352a, protobufStateStorageA, new I3(), new C5486v3(), new L3(), new Yi(this.f78352a), new J3(z()), new C5511w3(), (A3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f78362k;
    }

    public final Context g() {
        return this.f78352a;
    }

    public final L6 h() {
        if (this.f78354c == null) {
            synchronized (this) {
                try {
                    if (this.f78354c == null) {
                        this.f78354c = new L6(new K6(z()));
                    }
                } finally {
                }
            }
        }
        return this.f78354c;
    }

    public final T9 i() {
        T9 t92;
        T9 t93 = this.C;
        if (t93 != null) {
            return t93;
        }
        synchronized (this) {
            try {
                t92 = this.C;
                if (t92 == null) {
                    t92 = new T9(this.f78352a);
                    this.C = t92;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t92;
    }

    public final PermissionExtractor j() {
        C5554xl c5554xl = this.f78376y;
        if (c5554xl != null) {
            return c5554xl;
        }
        synchronized (this) {
            try {
                C5554xl c5554xl2 = this.f78376y;
                if (c5554xl2 != null) {
                    return c5554xl2;
                }
                C5554xl c5554xl3 = new C5554xl(p().f75630c.getAskForPermissionStrategy());
                this.f78376y = c5554xl3;
                return c5554xl3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Mb l() {
        Mb mb2;
        Mb mb3 = this.f78366o;
        if (mb3 != null) {
            return mb3;
        }
        synchronized (this) {
            try {
                mb2 = this.f78366o;
                if (mb2 == null) {
                    mb2 = new Mb(new W2(this.f78352a, this.f78355d.a()), new C5336p2());
                    this.f78366o = mb2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mb2;
    }

    public final Rb m() {
        Rb tb2;
        Rb rb2 = this.f78374w;
        if (rb2 != null) {
            return rb2;
        }
        synchronized (this) {
            try {
                tb2 = this.f78374w;
                if (tb2 == null) {
                    Context context = this.f78352a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    tb2 = locationClient == null ? new Tb() : new Sb(context, new Zb(), locationClient);
                    this.f78374w = tb2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tb2;
    }

    public final Rb n() {
        return m();
    }

    public final C4989bd o() {
        return this.f78371t;
    }

    public final Ck p() {
        Ck ck;
        Ck ck2 = this.f78369r;
        if (ck2 != null) {
            return ck2;
        }
        synchronized (this) {
            try {
                ck = this.f78369r;
                if (ck == null) {
                    ck = new Ck();
                    this.f78369r = ck;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ck;
    }

    public final Cd q() {
        Cd cd2;
        Cd cd3 = this.f78377z;
        if (cd3 != null) {
            return cd3;
        }
        synchronized (this) {
            try {
                cd2 = this.f78377z;
                if (cd2 == null) {
                    cd2 = new Cd(this.f78352a, new po());
                    this.f78377z = cd2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cd2;
    }

    public final Vd r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.f78360i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.f78360i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.f78360i = platformIdentifiers;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return platformIdentifiers;
    }

    public final C5573yf t() {
        E();
        return this.f78361j;
    }

    public final C5375qg u() {
        if (this.f78353b == null) {
            synchronized (this) {
                try {
                    if (this.f78353b == null) {
                        this.f78353b = new C5375qg(this.f78352a, H.D().f75641c);
                    }
                } finally {
                }
            }
        }
        return this.f78353b;
    }

    public final C5201jj v() {
        C5201jj c5201jj;
        C5201jj c5201jj2 = this.f78365n;
        if (c5201jj2 != null) {
            return c5201jj2;
        }
        synchronized (this) {
            try {
                c5201jj = this.f78365n;
                if (c5201jj == null) {
                    c5201jj = new C5201jj(this.f78352a);
                    this.f78365n = c5201jj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5201jj;
    }

    public final synchronized C5402rj w() {
        return this.f78357f;
    }

    public final C5329ok x() {
        return this.f78355d;
    }

    public final Bk y() {
        return this.F;
    }

    public final C5068ef z() {
        if (this.f78363l == null) {
            synchronized (this) {
                try {
                    if (this.f78363l == null) {
                        this.f78363l = new C5068ef(C5112g7.a(this.f78352a).c());
                    }
                } finally {
                }
            }
        }
        return this.f78363l;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
