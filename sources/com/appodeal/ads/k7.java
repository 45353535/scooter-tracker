package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k7 f13545a = new k7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f13546b = lf.i.a(new Function0() { // from class: com.appodeal.ads.b7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return k7.t();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f13547c = lf.i.a(new Function0() { // from class: com.appodeal.ads.c7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return k7.f();
        }
    });

    public static final com.appodeal.ads.analytics.breadcrumbs.e a(te teVar) {
        return new com.appodeal.ads.analytics.breadcrumbs.d(teVar.u(), "statsRequest");
    }

    public static final Event b(long j10) {
        return new SdkInternalEvent.SdkInternalConfig(j10, true);
    }

    public static final CoroutineScope f() {
        return kotlinx.coroutines.i.a((kotlinx.coroutines.s) f13546b.getValue());
    }

    public static void g(Context context, double d10, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        eg.i.d(q(), new eg.e0("ApdIapRequest"), null, new q5(new za(d10, str), context, null), 2, null);
    }

    public static final void h(l0 adController, final te adRequest, w cacheCallback, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(adController, "adController");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(cacheCallback, "cacheCallback");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.g7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k7.a(adRequest);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.appodeal.ads.services.r rVar = (com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14778a.getValue();
        Context applicationContext = com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext();
        zc instance = zc.f15321a;
        Intrinsics.checkNotNullExpressionValue(instance, "instance");
        eg.i.d(q(), new eg.e0("ApdStatsRequest"), null, new w6(new w5(applicationContext, adController, adRequest, rVar.d()), onComplete, cacheCallback, adController, jCurrentTimeMillis, null), 2, null);
    }

    public static void i(uc adObject, te adRequest, com.appodeal.ads.segments.o placement, Double d10) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        eg.i.d(q(), new eg.e0("ApdFinishRequest"), null, new x4(new b8(adObject, adRequest, placement, d10), null), 2, null);
    }

    public static void j(uc adObject, te adRequest, com.appodeal.ads.segments.o placement, Double d10, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        eg.i.d(q(), new eg.e0("ApdClickRequest"), null, new m4(new v7(adObject, adRequest, placement, d10), unifiedAdCallbackClickTrackListener, null), 2, null);
    }

    public static final void k(te adRequest, xe adRequestParams, l0 adTypeController, w callback) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(adTypeController, "adTypeController");
        Intrinsics.checkNotNullParameter(callback, "callback");
        eg.i.d(q(), new eg.e0("ApdGetRequest"), null, new i5(adRequest, adRequestParams, adTypeController, callback, null), 2, null);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e l() {
        return new com.appodeal.ads.analytics.breadcrumbs.d(null, "configRequest");
    }

    public static final Event m(long j10) {
        return new SdkInternalEvent.SdkInternalConfig(j10, false);
    }

    public static final Event o(long j10) {
        return new SdkInternalEvent.SdkInternalInit(j10, false);
    }

    public static CoroutineScope q() {
        return (CoroutineScope) f13547c.getValue();
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e r() {
        return new com.appodeal.ads.analytics.breadcrumbs.d(null, "initRequest");
    }

    public static final Event s(long j10) {
        return new SdkInternalEvent.SdkInternalInit(j10, true);
    }

    public static final kotlinx.coroutines.s t() {
        return eg.q1.b("networking");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.c6
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.c6 r0 = (com.appodeal.ads.c6) r0
            int r1 = r0.f13165t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13165t = r1
            goto L18
        L13:
            com.appodeal.ads.c6 r0 = new com.appodeal.ads.c6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13163r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13165t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.d.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.l()
            goto L49
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.d.b(r6)
            com.appodeal.ads.dc r6 = new com.appodeal.ads.dc
            r6.<init>(r5)
            r0.f13165t = r3
            com.appodeal.ads.networking.processors.c r5 = com.appodeal.ads.networking.processors.c.f14154b
            java.lang.Object r5 = com.appodeal.ads.networking.v.a(r6, r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k7.c(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.g6
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.g6 r0 = (com.appodeal.ads.g6) r0
            int r1 = r0.f13350t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13350t = r1
            goto L18
        L13:
            com.appodeal.ads.g6 r0 = new com.appodeal.ads.g6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13348r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13350t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.l()
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.d.b(r6)
            com.appodeal.ads.qc r6 = new com.appodeal.ads.qc
            r6.<init>(r5)
            r0.f13350t = r3
            com.appodeal.ads.networking.processors.c r5 = com.appodeal.ads.networking.processors.c.f14154b
            java.lang.Object r5 = com.appodeal.ads.networking.v.a(r6, r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            boolean r6 = kotlin.Result.j(r5)
            if (r6 == 0) goto L59
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            kotlin.Unit r5 = kotlin.Unit.f93236a
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        L59:
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k7.d(java.util.List, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.appodeal.ads.q4
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.ads.q4 r0 = (com.appodeal.ads.q4) r0
            int r1 = r0.f14294u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14294u = r1
            goto L18
        L13:
            com.appodeal.ads.q4 r0 = new com.appodeal.ads.q4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14292s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14294u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r0 = r0.f14291r
            kotlin.d.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.l()
            goto L5d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            kotlin.d.b(r7)
            com.appodeal.ads.analytics.breadcrumbs.n r7 = com.appodeal.ads.analytics.breadcrumbs.n.f12678b
            com.appodeal.ads.d7 r2 = new com.appodeal.ads.d7
            r2.<init>()
            r7.b(r2)
            long r4 = java.lang.System.currentTimeMillis()
            com.appodeal.ads.e9 r7 = new com.appodeal.ads.e9
            r7.<init>()
            r0.f14291r = r4
            r0.f14294u = r3
            com.appodeal.ads.networking.processors.c r2 = com.appodeal.ads.networking.processors.c.f14154b
            java.lang.Object r7 = com.appodeal.ads.networking.v.a(r7, r2, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r0 = r4
        L5d:
            boolean r2 = kotlin.Result.j(r7)
            if (r2 == 0) goto L70
            r2 = r7
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.appodeal.ads.analytics.AppodealAnalytics r2 = com.appodeal.ads.analytics.AppodealAnalytics.INSTANCE
            com.appodeal.ads.e7 r3 = new com.appodeal.ads.e7
            r3.<init>()
            r2.internalEvent(r3)
        L70:
            java.lang.Throwable r2 = kotlin.Result.g(r7)
            if (r2 == 0) goto L80
            com.appodeal.ads.analytics.AppodealAnalytics r2 = com.appodeal.ads.analytics.AppodealAnalytics.INSTANCE
            com.appodeal.ads.f7 r3 = new com.appodeal.ads.f7
            r3.<init>()
            r2.internalEvent(r3)
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k7.e(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.appodeal.ads.y5
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.ads.y5 r0 = (com.appodeal.ads.y5) r0
            int r1 = r0.f15279u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15279u = r1
            goto L18
        L13:
            com.appodeal.ads.y5 r0 = new com.appodeal.ads.y5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f15277s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15279u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r0 = r0.f15276r
            kotlin.d.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.l()
            goto L5d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            kotlin.d.b(r7)
            com.appodeal.ads.analytics.breadcrumbs.n r7 = com.appodeal.ads.analytics.breadcrumbs.n.f12678b
            com.appodeal.ads.h7 r2 = new com.appodeal.ads.h7
            r2.<init>()
            r7.b(r2)
            long r4 = java.lang.System.currentTimeMillis()
            com.appodeal.ads.eb r7 = new com.appodeal.ads.eb
            r7.<init>()
            r0.f15276r = r4
            r0.f15279u = r3
            com.appodeal.ads.networking.processors.c r2 = com.appodeal.ads.networking.processors.c.f14154b
            java.lang.Object r7 = com.appodeal.ads.networking.v.a(r7, r2, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r0 = r4
        L5d:
            boolean r2 = kotlin.Result.j(r7)
            if (r2 == 0) goto L70
            r2 = r7
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.appodeal.ads.analytics.AppodealAnalytics r2 = com.appodeal.ads.analytics.AppodealAnalytics.INSTANCE
            com.appodeal.ads.i7 r3 = new com.appodeal.ads.i7
            r3.<init>()
            r2.internalEvent(r3)
        L70:
            java.lang.Throwable r2 = kotlin.Result.g(r7)
            if (r2 == 0) goto L80
            com.appodeal.ads.analytics.AppodealAnalytics r2 = com.appodeal.ads.analytics.AppodealAnalytics.INSTANCE
            com.appodeal.ads.j7 r3 = new com.appodeal.ads.j7
            r3.<init>()
            r2.internalEvent(r3)
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k7.n(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(kotlin.coroutines.jvm.internal.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.appodeal.ads.l6
            if (r0 == 0) goto L13
            r0 = r5
            com.appodeal.ads.l6 r0 = (com.appodeal.ads.l6) r0
            int r1 = r0.f13613t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13613t = r1
            goto L18
        L13:
            com.appodeal.ads.l6 r0 = new com.appodeal.ads.l6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13611r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13613t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.l()
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.d.b(r5)
            com.appodeal.ads.wc r5 = new com.appodeal.ads.wc
            r5.<init>()
            r0.f13613t = r3
            com.appodeal.ads.networking.processors.c r2 = com.appodeal.ads.networking.processors.c.f14154b
            java.lang.Object r5 = com.appodeal.ads.networking.v.a(r5, r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            boolean r0 = kotlin.Result.j(r5)
            if (r0 == 0) goto L59
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            kotlin.Unit r5 = kotlin.Unit.f93236a
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        L59:
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k7.p(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
