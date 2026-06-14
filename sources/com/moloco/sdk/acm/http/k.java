package com.moloco.sdk.acm.http;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oe.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie.c f54076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54078c;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f54079r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f54081t;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54079r = obj;
            this.f54081t |= Integer.MIN_VALUE;
            Object objA = k.this.a(null, null, this);
            return objA == pf.b.g() ? objA : Result.a(objA);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54082r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54083s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f54084t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54086v;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54084t = obj;
            this.f54086v |= Integer.MIN_VALUE;
            Object objB = k.this.b(0L, null, null, this);
            return objB == pf.b.g() ? objB : Result.a(objB);
        }
    }

    public k(ie.c httpClient, String apiUrl) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        this.f54076a = httpClient;
        this.f54077b = apiUrl;
        this.f54078c = "PostMetricsRequest";
    }

    public static final Unit d(long j10, x0 timeout) {
        Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
        timeout.f(Long.valueOf(j10));
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.moloco.sdk.acm.http.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.moloco.sdk.acm.http.h r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.http.k.a
            if (r0 == 0) goto L14
            r0 = r10
            com.moloco.sdk.acm.http.k$a r0 = (com.moloco.sdk.acm.http.k.a) r0
            int r1 = r0.f54081t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f54081t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.moloco.sdk.acm.http.k$a r0 = new com.moloco.sdk.acm.http.k$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f54079r
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f54081t
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.d.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.l()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.d.b(r10)
            r6.f54081t = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            r1 = r7
            r4 = r8
            r5 = r9
            java.lang.Object r8 = r1.b(r2, r4, r5, r6)
            if (r8 != r0) goto L4a
            return r0
        L4a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.k.a(com.moloco.sdk.acm.http.h, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        if (r14 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(final long r10, com.moloco.sdk.acm.http.h r12, kotlin.jvm.functions.Function1 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.k.b(long, com.moloco.sdk.acm.http.h, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final byte[] e(h hVar) {
        GeneratedMessageLite generatedMessageLiteBuild = MetricsRequest$PostMetricsRequest.newBuilder().a(hVar.a()).b(hVar.b()).build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        byte[] byteArray = ((MetricsRequest$PostMetricsRequest) generatedMessageLiteBuild).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
