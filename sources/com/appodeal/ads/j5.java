package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.utils.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7 f13503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContextProvider f13504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.g f13505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.appodeal.ads.initializing.h f13506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f13507e;

    public j5() {
        k7 appodealNetworkRequestApi = k7.f13545a;
        com.appodeal.ads.context.o contextProvider = com.appodeal.ads.context.o.f13205b;
        com.appodeal.ads.utils.session.r sessionManager = com.appodeal.ads.utils.session.r.f15109b;
        com.appodeal.ads.initializing.j adNetworkRegistry = com.appodeal.ads.initializing.j.f13479b;
        CoroutineScope scope = kotlinx.coroutines.i.a(eg.o0.c().plus(new eg.e0("ApdInitRequest")));
        Intrinsics.checkNotNullParameter(appodealNetworkRequestApi, "appodealNetworkRequestApi");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(adNetworkRegistry, "adNetworkRegistry");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f13503a = appodealNetworkRequestApi;
        this.f13504b = contextProvider;
        this.f13505c = sessionManager;
        this.f13506d = adNetworkRegistry;
        this.f13507e = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.appodeal.ads.j5 r21, com.appodeal.ads.modules.common.internal.context.ContextProvider r22, com.appodeal.ads.initializing.h r23, com.appodeal.ads.utils.session.g r24, java.util.List r25, kotlin.coroutines.jvm.internal.d r26) {
        /*
            r6 = r21
            r0 = r26
            boolean r1 = r0 instanceof com.appodeal.ads.h4
            if (r1 == 0) goto L18
            r1 = r0
            com.appodeal.ads.h4 r1 = (com.appodeal.ads.h4) r1
            int r2 = r1.f13385u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f13385u = r2
        L16:
            r10 = r1
            goto L1e
        L18:
            com.appodeal.ads.h4 r1 = new com.appodeal.ads.h4
            r1.<init>(r6, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r10.f13383s
            java.lang.Object r11 = pf.b.g()
            int r1 = r10.f13385u
            r12 = 1
            if (r1 == 0) goto L39
            if (r1 != r12) goto L31
            java.util.Iterator r1 = r10.f13382r
            kotlin.d.b(r0)
            goto L8e
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.d.b(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            r1 = r25
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r0)
            r13.<init>(r0)
            java.util.Iterator r14 = r1.iterator()
        L4d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r14.next()
            r5 = r0
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r0 = "status"
            java.lang.String r4 = r5.optString(r0)
            java.lang.String r0 = "tmax"
            r1 = 15000(0x3a98, double:7.411E-320)
            long r1 = r5.optLong(r0, r1)
            kotlinx.coroutines.CoroutineScope r15 = r6.f13507e
            com.appodeal.ads.r4 r0 = new com.appodeal.ads.r4
            r9 = 0
            r7 = r22
            r3 = r23
            r8 = r24
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            r19 = 3
            r20 = 0
            r16 = 0
            r17 = 0
            r18 = r0
            kotlinx.coroutines.Deferred r0 = eg.g.b(r15, r16, r17, r18, r19, r20)
            r13.add(r0)
            r6 = r21
            goto L4d
        L8a:
            java.util.Iterator r1 = r13.iterator()
        L8e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r1.next()
            kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
            r10.f13382r = r1
            r10.f13385u = r12
            java.lang.Object r0 = r0.await(r10)
            if (r0 != r11) goto L8e
            return r11
        La5:
            kotlin.Unit r0 = kotlin.Unit.f93236a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.j5.b(com.appodeal.ads.j5, com.appodeal.ads.modules.common.internal.context.ContextProvider, com.appodeal.ads.initializing.h, com.appodeal.ads.utils.session.g, java.util.List, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final Object c(j5 j5Var, ContextProvider contextProvider, com.appodeal.ads.utils.session.g gVar, AdNetwork adNetwork, InitializeParams initializeParams, n4 n4Var) throws Throwable {
        of.e eVar = new of.e(pf.b.d(n4Var));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!adNetwork.isInitialized()) {
            wa waVar = new wa(new w3(adNetwork.getName()), gVar);
            adNetwork.setLogging(Appodeal.getLogLevel() == Log.LogLevel.verbose);
            Intrinsics.checkNotNull(adNetwork, "null cannot be cast to non-null type com.appodeal.ads.AdNetwork<com.appodeal.ads.InitializeParams, *>");
            adNetwork.initialize(contextProvider, initializeParams, waVar, new d4(atomicBoolean, eVar));
        } else if (atomicBoolean.compareAndSet(false, true)) {
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        }
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(n4Var);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.f5
            if (r0 == 0) goto L13
            r0 = r9
            com.appodeal.ads.f5 r0 = (com.appodeal.ads.f5) r0
            int r1 = r0.f13320u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13320u = r1
            goto L18
        L13:
            com.appodeal.ads.f5 r0 = new com.appodeal.ads.f5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f13318s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13320u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.appodeal.ads.j5 r0 = r0.f13317r
            kotlin.d.b(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.l()
            goto L4a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            kotlin.d.b(r9)
            com.appodeal.ads.k7 r9 = r8.f13503a
            r0.f13317r = r8
            r0.f13320u = r3
            java.lang.Object r9 = r9.n(r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            r0 = r8
        L4a:
            boolean r1 = kotlin.Result.j(r9)
            if (r1 == 0) goto L9e
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            if (r9 == 0) goto L97
            r0.getClass()
            java.lang.String r1 = com.appodeal.ads.db.f13239a
            java.lang.String r1 = "jObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r2 = "log"
            boolean r2 = r9.optBoolean(r2)
            if (r2 == 0) goto L6e
            com.appodeal.ads.utils.Log$LogLevel r2 = com.appodeal.ads.utils.Log.LogLevel.verbose
            com.appodeal.ads.h2.p(r2)
            com.appodeal.ads.ext.LogExtKt.setLogEnable(r3)
        L6e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "report"
            boolean r2 = r9.has(r1)
            if (r2 == 0) goto L80
            r2 = 0
            boolean r1 = r9.optBoolean(r1, r2)
            com.appodeal.ads.db.f13241c = r1
        L80:
            com.appodeal.ads.v4.h(r9)
            com.appodeal.ads.utils.session.g r1 = r0.f13505c
            r1.a(r9)
            kotlinx.coroutines.CoroutineScope r2 = r0.f13507e
            com.appodeal.ads.a5 r5 = new com.appodeal.ads.a5
            r1 = 0
            r5.<init>(r9, r0, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            eg.g.d(r2, r3, r4, r5, r6, r7)
        L97:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            java.lang.Object r9 = kotlin.Result.b(r9)
            return r9
        L9e:
            java.lang.Object r9 = kotlin.Result.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.j5.d(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
