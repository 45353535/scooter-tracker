package com.moloco.sdk.service_locator;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.services.SingleObserverBackgroundThenForegroundAnalyticsListener;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.init.g;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u0;
import eg.m1;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f55791a = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55792a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55793b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.a.c();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55794c = 8;

        public static final com.moloco.sdk.internal.services.k c() {
            return new com.moloco.sdk.internal.services.k(b.f55791a.a());
        }

        public final o0 a() {
            return q0.a(g.f55823a.a(), C0685b.f55795a.f());
        }

        public final com.moloco.sdk.internal.services.k b() {
            return (com.moloco.sdk.internal.services.k) f55793b.getValue();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.service_locator.b$b, reason: collision with other inner class name */
    public static final class C0685b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0685b f55795a = new C0685b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55796b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.C0685b.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy f55797c = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.C0685b.j();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Lazy f55798d = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.C0685b.b();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Lazy f55799e = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.C0685b.c();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Lazy f55800f = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.C0685b.i();
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f55801g = 8;

        public static final com.moloco.sdk.internal.services.analytics.b a() {
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVarC = i.f55834a.c();
            k kVar = k.f55843a;
            return new com.moloco.sdk.internal.services.analytics.b(lVarC, kVar.b(), kVar.c());
        }

        public static final com.moloco.sdk.internal.services.r b() {
            return new com.moloco.sdk.internal.services.r(ProcessLifecycleOwner.INSTANCE.get().getLifecycle(), f55795a.h());
        }

        public static final com.moloco.sdk.internal.error.c c() {
            return new com.moloco.sdk.internal.error.c(c.f55802a.b(), new com.moloco.sdk.internal.error.api.b(h.f55827a.h(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a()));
        }

        public static final com.moloco.sdk.internal.ilrd.c i() {
            return new com.moloco.sdk.internal.ilrd.c(b.f55791a.a());
        }

        public static final SingleObserverBackgroundThenForegroundAnalyticsListener j() {
            return new SingleObserverBackgroundThenForegroundAnalyticsListener(f55795a.d(), h.f55827a.h());
        }

        public final com.moloco.sdk.internal.services.analytics.a d() {
            return (com.moloco.sdk.internal.services.analytics.a) f55796b.getValue();
        }

        public final com.moloco.sdk.internal.services.q e() {
            return (com.moloco.sdk.internal.services.q) f55798d.getValue();
        }

        public final com.moloco.sdk.internal.error.b f() {
            return (com.moloco.sdk.internal.error.b) f55799e.getValue();
        }

        public final com.moloco.sdk.internal.ilrd.c g() {
            return (com.moloco.sdk.internal.ilrd.c) f55800f.getValue();
        }

        public final SingleObserverBackgroundThenForegroundAnalyticsListener h() {
            return (SingleObserverBackgroundThenForegroundAnalyticsListener) f55797c.getValue();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f55802a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55803b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.c.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55804c = 8;

        public static final com.moloco.sdk.internal.services.config.b a() {
            return new com.moloco.sdk.internal.services.config.b();
        }

        public final com.moloco.sdk.internal.services.config.a b() {
            return (com.moloco.sdk.internal.services.config.a) f55803b.getValue();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f55805a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55806b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.d.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55807c = 8;

        public static final com.moloco.sdk.internal.error.crash.c a() {
            return new com.moloco.sdk.internal.error.crash.c(new com.moloco.sdk.internal.error.crash.e(CollectionsKt.listOf(new com.moloco.sdk.internal.error.crash.filters.b()), new com.moloco.sdk.internal.error.api.b(h.f55827a.h(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a()), com.moloco.sdk.acm.recorder.a.Companion.b()));
        }

        public final com.moloco.sdk.internal.error.crash.a b() {
            return (com.moloco.sdk.internal.error.crash.a) f55806b.getValue();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f55808a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55809b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.e.b();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy f55810c = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.e.f();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Lazy f55811d = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.e.c();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Lazy f55812e = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.e.n();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Lazy f55813f = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.e.e();
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Lazy f55814g = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.e.d();
            }
        });

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Lazy f55815h = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.e.a();
            }
        });

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f55816i = 8;

        public static final com.moloco.sdk.internal.services.m a() {
            return new com.moloco.sdk.internal.services.m(b.f55791a.a());
        }

        public static final com.moloco.sdk.internal.services.w b() {
            return new com.moloco.sdk.internal.services.w(b.f55791a.a());
        }

        public static final com.moloco.sdk.internal.services.z c() {
            return new com.moloco.sdk.internal.services.z(b.f55791a.a());
        }

        public static final com.moloco.sdk.internal.services.b0 d() {
            return new com.moloco.sdk.internal.services.b0(b.f55791a.a());
        }

        public static final com.moloco.sdk.internal.services.f0 e() {
            return new com.moloco.sdk.internal.services.f0(b.f55791a.a());
        }

        public static final com.moloco.sdk.internal.services.t f() {
            return new com.moloco.sdk.internal.services.t(b.f55791a.a());
        }

        public static final com.moloco.sdk.internal.services.g n() {
            return new com.moloco.sdk.internal.services.g(b.f55791a.a());
        }

        public final com.moloco.sdk.internal.services.l g() {
            return (com.moloco.sdk.internal.services.l) f55815h.getValue();
        }

        public final com.moloco.sdk.internal.services.v h() {
            return (com.moloco.sdk.internal.services.v) f55809b.getValue();
        }

        public final com.moloco.sdk.internal.services.y i() {
            return (com.moloco.sdk.internal.services.y) f55811d.getValue();
        }

        public final com.moloco.sdk.internal.services.a0 j() {
            return (com.moloco.sdk.internal.services.a0) f55814g.getValue();
        }

        public final com.moloco.sdk.internal.services.e0 k() {
            return (com.moloco.sdk.internal.services.e0) f55813f.getValue();
        }

        public final i0 l() {
            return (i0) f55810c.getValue();
        }

        public final com.moloco.sdk.internal.services.f m() {
            return (com.moloco.sdk.internal.services.f) f55812e.getValue();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile com.moloco.sdk.internal.e f55818b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f55817a = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy f55819c = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.f.g();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Lazy f55820d = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.f.e();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Lazy f55821e = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.f.f();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f55822f = 8;

        public static final com.moloco.sdk.internal.services.init.f e() {
            e eVar = e.f55808a;
            return new com.moloco.sdk.internal.services.init.f(eVar.l(), eVar.h(), k.f55843a.f(), BuildConfig.SDK_VERSION_NAME, BuildConfig.MOLOCO_ENDPOINT_INIT_CONFIG, 3000L, i.f55834a.a());
        }

        public static final com.moloco.sdk.internal.services.init.k f() {
            com.moloco.sdk.internal.services.init.d dVarB = f55817a.b();
            g.a aVar = com.moloco.sdk.internal.services.init.g.f55640a;
            SharedPreferences sharedPreferences = b.f55791a.a().getSharedPreferences("moloco_sdk_init_cache", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            return new com.moloco.sdk.internal.services.init.k(dVarB, aVar.a(sharedPreferences), kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getIo().plus(m1.b(null, 1, null))));
        }

        public static final com.moloco.sdk.internal.services.init.n g() {
            return new com.moloco.sdk.internal.services.init.n(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a());
        }

        public final com.moloco.sdk.internal.e a(Init$SDKInitResponse initResponse) {
            com.moloco.sdk.internal.e gVar;
            Intrinsics.checkNotNullParameter(initResponse, "initResponse");
            com.moloco.sdk.internal.e eVar = f55818b;
            if (eVar != null) {
                return eVar;
            }
            synchronized (this) {
                gVar = f55818b;
                if (gVar == null) {
                    gVar = new com.moloco.sdk.internal.g(initResponse, k.f55843a.b(), h.f55827a.e());
                    f55818b = gVar;
                }
            }
            return gVar;
        }

        public final com.moloco.sdk.internal.services.init.d b() {
            return (com.moloco.sdk.internal.services.init.d) f55820d.getValue();
        }

        public final com.moloco.sdk.internal.services.init.j c() {
            return (com.moloco.sdk.internal.services.init.j) f55821e.getValue();
        }

        public final com.moloco.sdk.internal.services.init.m d() {
            return (com.moloco.sdk.internal.services.init.m) f55819c.getValue();
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f55823a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55824b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.g.d();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy f55825c = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.g.c();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f55826d = 8;

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n c() {
            g gVar = f55823a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o oVarB = gVar.b();
            e eVar = e.f55808a;
            com.moloco.sdk.internal.services.e0 e0VarK = eVar.k();
            C0685b c0685b = C0685b.f55795a;
            com.moloco.sdk.internal.error.b bVarF = c0685b.f();
            i iVar = i.f55834a;
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n(gVar.b(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j(eVar.k(), c0685b.f(), iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f(oVarB, e0VarK, bVarF, iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l(b.f55791a.a(), "com.moloco.sdk.xenoss.sdkdevkit.android.cache"));
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o) c.f55802a.b().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o.class, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p.a());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m a() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m) f55825c.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o b() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o) f55824b.getValue();
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f55827a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55828b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.h.l();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy f55829c = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.h.k();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Lazy f55830d = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.h.b();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Lazy f55831e = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.h.m();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Lazy f55832f = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.h.a();
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f55833g = 8;

        public static final ActivityManager a() {
            Object systemService = b.f55791a.a().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return (ActivityManager) systemService;
        }

        public static final com.moloco.sdk.internal.services.p b() {
            return new com.moloco.sdk.internal.services.p(b.f55791a.a());
        }

        public static final com.moloco.sdk.internal.services.proto.b k() {
            return new com.moloco.sdk.internal.services.proto.b();
        }

        public static final com.moloco.sdk.internal.services.j l() {
            return new com.moloco.sdk.internal.services.j();
        }

        public static final com.moloco.sdk.internal.c m() {
            return new com.moloco.sdk.internal.c();
        }

        public final ActivityManager c() {
            return (ActivityManager) f55832f.getValue();
        }

        public final com.moloco.sdk.internal.services.o d() {
            return (com.moloco.sdk.internal.services.o) f55830d.getValue();
        }

        public final com.moloco.sdk.internal.services.c0 e() {
            return new com.moloco.sdk.internal.services.d0(f(), k.f55843a.b());
        }

        public final t0 f() {
            return new u0(b.f55791a.a());
        }

        public final com.moloco.sdk.internal.services.proto.a g() {
            return (com.moloco.sdk.internal.services.proto.a) f55829c.getValue();
        }

        public final com.moloco.sdk.internal.services.i h() {
            return (com.moloco.sdk.internal.services.i) f55828b.getValue();
        }

        public final com.moloco.sdk.internal.a i() {
            return (com.moloco.sdk.internal.a) f55831e.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t j() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u();
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f55834a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55835b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.i.e();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy f55836c = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.i.f();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Lazy f55837d = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.i.h();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Lazy f55838e = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.i.g();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f55839f = 8;

        public static final ie.c e() {
            e eVar = e.f55808a;
            return com.moloco.sdk.internal.http.e.a(eVar.h().invoke(), eVar.l().invoke());
        }

        public static final com.moloco.sdk.internal.services.c f() {
            return new com.moloco.sdk.internal.services.c(b.f55791a.a(), e.f55808a.l());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l g() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l.f58971a.a(f55834a.d());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.p h() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.p(b.f55791a.a());
        }

        public final ie.c a() {
            return (ie.c) f55835b.getValue();
        }

        public final com.moloco.sdk.internal.services.b b() {
            return (com.moloco.sdk.internal.services.b) f55836c.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l) f55838e.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o) f55837d.getValue();
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f55840a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55841b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.j.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55842c = 8;

        public static final com.moloco.sdk.internal.services.d a() {
            SharedPreferences sharedPreferences = b.f55791a.a().getSharedPreferences("moloco_sdk_preferences", 0);
            Intrinsics.checkNotNull(sharedPreferences);
            return new com.moloco.sdk.internal.services.d(sharedPreferences);
        }

        public final com.moloco.sdk.internal.services.g0 b() {
            return (com.moloco.sdk.internal.services.g0) f55841b.getValue();
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f55843a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f55844b = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.k.g();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy f55845c = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.k.h();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Lazy f55846d = lf.i.a(new Function0() { // from class: com.moloco.sdk.service_locator.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.k.a();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f55847e = 8;

        public static final com.moloco.sdk.internal.services.events.c a() {
            return new com.moloco.sdk.internal.services.events.c();
        }

        public static final com.moloco.sdk.internal.services.usertracker.c g() {
            return new com.moloco.sdk.internal.services.usertracker.c(j.f55840a.b());
        }

        public static final com.moloco.sdk.internal.services.usertracker.f h() {
            k kVar = f55843a;
            return new com.moloco.sdk.internal.services.usertracker.f(kVar.e(), kVar.d());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b() {
            e eVar = e.f55808a;
            com.moloco.sdk.internal.services.v vVarH = eVar.h();
            com.moloco.sdk.internal.services.b bVarB = i.f55834a.b();
            i0 i0VarL = eVar.l();
            com.moloco.sdk.internal.services.f fVarM = eVar.m();
            com.moloco.sdk.internal.services.usertracker.e eVarF = f();
            h hVar = h.f55827a;
            return new com.moloco.sdk.internal.services.events.a(vVarH, bVarB, i0VarL, fVarM, eVarF, hVar.d(), hVar.g(), c(), BuildConfig.SDK_VERSION_NAME);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) f55846d.getValue();
        }

        public final com.moloco.sdk.internal.services.usertracker.b d() {
            return (com.moloco.sdk.internal.services.usertracker.b) f55844b.getValue();
        }

        public final com.moloco.sdk.internal.services.usertracker.d e() {
            return new com.moloco.sdk.internal.services.usertracker.a();
        }

        public final com.moloco.sdk.internal.services.usertracker.e f() {
            return (com.moloco.sdk.internal.services.usertracker.e) f55845c.getValue();
        }
    }

    public final Context a() {
        return com.moloco.sdk.internal.android_context.b.b(null, 1, null);
    }
}
