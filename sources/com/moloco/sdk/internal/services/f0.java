package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.core.net.ConnectivityManagerCompat;
import com.moloco.sdk.internal.MolocoLogger;
import eg.k0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55582b;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f55583r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f55585t;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55583r = obj;
            this.f55585t |= Integer.MIN_VALUE;
            return f0.this.a(0L, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55586r;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return f0.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55586r;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            while (!f0.this.d()) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, f0.this.f55582b, "waiting because of no network connection", null, false, 12, null);
                this.f55586r = 1;
                if (k0.a(100L, this) == objG) {
                    return objG;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    public f0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55581a = context;
        this.f55582b = "ConnectivityServiceImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.moloco.sdk.internal.services.f0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.internal.services.f0$a r0 = (com.moloco.sdk.internal.services.f0.a) r0
            int r1 = r0.f55585t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55585t = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.f0$a r0 = new com.moloco.sdk.internal.services.f0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f55583r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f55585t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r7)
            com.moloco.sdk.internal.services.f0$b r7 = new com.moloco.sdk.internal.services.f0$b
            r2 = 0
            r7.<init>(r2)
            r0.f55585t = r3
            java.lang.Object r7 = eg.x1.e(r5, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L4c
            boolean r5 = r7.booleanValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.f0.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.e0
    public boolean b() {
        try {
            return ConnectivityManagerCompat.isActiveNetworkMetered(b(this.f55581a));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "isNetworkMetered", e10.toString(), e10, false, 8, null);
            return false;
        }
    }

    public boolean d() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.f55581a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    public final ConnectivityManager b(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
