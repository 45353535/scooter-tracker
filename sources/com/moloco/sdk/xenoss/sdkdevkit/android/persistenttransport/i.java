package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie.c f58958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f58959c;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58961s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f58963u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f58963u = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new a(this.f58963u, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        
            if (eg.k0.a(10000, r12) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:26:0x0087). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r12.f58961s
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                int r1 = r12.f58960r
                kotlin.d.b(r13)
                goto L87
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                int r1 = r12.f58960r
                kotlin.d.b(r13)
                goto L6d
            L24:
                kotlin.d.b(r13)
                r1 = r2
            L28:
                r13 = 5
                if (r1 >= r13) goto L89
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i r13 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.this
                r5 = 0
                android.content.Context r5 = com.moloco.sdk.internal.android_context.b.b(r5, r4, r5)
                boolean r13 = r13.c(r5)
                com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Network available: "
                r6.append(r7)
                r6.append(r13)
                java.lang.String r7 = " for non persistent request"
                r6.append(r7)
                java.lang.String r7 = r6.toString()
                r10 = 12
                r11 = 0
                java.lang.String r6 = "NonPersistentRequest"
                r8 = 0
                r9 = 0
                com.moloco.sdk.internal.MolocoLogger.info$default(r5, r6, r7, r8, r9, r10, r11)
                if (r13 == 0) goto L74
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i r13 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.this
                ie.c r13 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.b(r13)
                java.lang.String r5 = r12.f58963u
                r12.f58960r = r1
                r12.f58961s = r4
                java.lang.Object r13 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a(r13, r5, r12)
                if (r13 != r0) goto L6d
                goto L86
            L6d:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                goto L75
            L74:
                r13 = r2
            L75:
                if (r13 == 0) goto L7a
                kotlin.Unit r13 = kotlin.Unit.f93236a
                return r13
            L7a:
                r12.f58960r = r1
                r12.f58961s = r3
                r5 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r13 = eg.k0.a(r5, r12)
                if (r13 != r0) goto L87
            L86:
                return r0
            L87:
                int r1 = r1 + r4
                goto L28
            L89:
                kotlin.Unit r13 = kotlin.Unit.f93236a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58964r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58965s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f58967u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ byte[] f58968v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ve.g f58969w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, byte[] bArr, ve.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f58967u = str;
            this.f58968v = bArr;
            this.f58969w = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new b(this.f58967u, this.f58968v, this.f58969w, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        
            if (r14 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        
            if (eg.k0.a(10000, r13) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0090 -> B:26:0x0093). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r13.f58965s
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                int r1 = r13.f58964r
                kotlin.d.b(r14)
                r10 = r13
                goto L93
            L17:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1f:
                int r1 = r13.f58964r
                kotlin.d.b(r14)
                r10 = r13
                goto L78
            L26:
                kotlin.d.b(r14)
                r1 = r2
            L2a:
                r14 = 5
                if (r1 >= r14) goto L95
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i r14 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.this
                r5 = 0
                android.content.Context r5 = com.moloco.sdk.internal.android_context.b.b(r5, r4, r5)
                boolean r14 = r14.c(r5)
                com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Network available: "
                r6.append(r7)
                r6.append(r14)
                java.lang.String r7 = " for non persistent request"
                r6.append(r7)
                java.lang.String r7 = r6.toString()
                r10 = 12
                r11 = 0
                java.lang.String r6 = "NonPersistentRequest"
                r8 = 0
                r9 = 0
                com.moloco.sdk.internal.MolocoLogger.info$default(r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L7f
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i r14 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.this
                ie.c r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.b(r14)
                java.lang.String r6 = r13.f58967u
                byte[] r7 = r13.f58968v
                ve.g r8 = r13.f58969w
                r13.f58964r = r1
                r13.f58965s = r4
                r11 = 8
                r12 = 0
                r9 = 0
                r10 = r13
                java.lang.Object r14 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.c(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L78
                goto L92
            L78:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                goto L81
            L7f:
                r10 = r13
                r14 = r2
            L81:
                if (r14 == 0) goto L86
                kotlin.Unit r14 = kotlin.Unit.f93236a
                return r14
            L86:
                r10.f58964r = r1
                r10.f58965s = r3
                r5 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r14 = eg.k0.a(r5, r13)
                if (r14 != r0) goto L93
            L92:
                return r0
            L93:
                int r1 = r1 + r4
                goto L2a
            L95:
                r10 = r13
                kotlin.Unit r14 = kotlin.Unit.f93236a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(ie.c httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f58958b = httpClient;
        this.f58959c = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getDefault());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        eg.i.d(this.f58959c, null, null, new a(url, null), 3, null);
    }

    public final boolean c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url, byte[] body, ve.g contentType, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        eg.i.d(this.f58959c, null, null, new b(url, body, contentType, null), 3, null);
    }
}
