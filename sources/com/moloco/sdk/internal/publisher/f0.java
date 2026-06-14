package com.moloco.sdk.internal.publisher;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f54754c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.a f54755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f54756b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54757r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54758s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f54759t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54761v;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54759t = obj;
            this.f54761v |= Integer.MIN_VALUE;
            return f0.this.b(null, null, this);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54762r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f54763s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f54765u;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54763s = obj;
            this.f54765u |= Integer.MIN_VALUE;
            return f0.this.d(null, null, this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54766r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f54767s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f54769u;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54767s = obj;
            this.f54769u |= Integer.MIN_VALUE;
            return f0.this.c(null, this);
        }
    }

    public f0(com.moloco.sdk.internal.ortb.a bidResponseParser, g0 bidProcessor) {
        Intrinsics.checkNotNullParameter(bidResponseParser, "bidResponseParser");
        Intrinsics.checkNotNullParameter(bidProcessor, "bidProcessor");
        this.f54755a = bidResponseParser;
        this.f54756b = bidProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.f0.b
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.f0$b r0 = (com.moloco.sdk.internal.publisher.f0.b) r0
            int r1 = r0.f54761v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54761v = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.f0$b r0 = new com.moloco.sdk.internal.publisher.f0$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f54759t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54761v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r14)
            return r14
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.Object r12 = r0.f54758s
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.f54757r
            com.moloco.sdk.internal.publisher.f0 r13 = (com.moloco.sdk.internal.publisher.f0) r13
            kotlin.d.b(r14)
            goto L6c
        L40:
            kotlin.d.b(r14)
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "parse() called with bidResponseJson: "
            r14.append(r2)
            r14.append(r13)
            java.lang.String r7 = r14.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "BidLoader"
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r5, r6, r7, r8, r9, r10)
            r0.f54757r = r11
            r0.f54758s = r12
            r0.f54761v = r4
            java.lang.Object r14 = r11.c(r13, r0)
            if (r14 != r1) goto L6b
            goto L99
        L6b:
            r13 = r11
        L6c:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L7e
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r13 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR
            com.moloco.sdk.internal.s r14 = com.moloco.sdk.internal.s.f55255c
            com.moloco.sdk.internal.d0 r12 = com.moloco.sdk.internal.e0.a(r12, r13, r14)
            com.moloco.sdk.internal.h0$a r13 = new com.moloco.sdk.internal.h0$a
            r13.<init>(r12)
            return r13
        L7e:
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r9 = 12
            r10 = 0
            java.lang.String r5 = "BidLoader"
            java.lang.String r6 = "Processed the bidResponse, proceeding with parsing it."
            r7 = 0
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            r0.f54757r = r2
            r0.f54758s = r2
            r0.f54761v = r3
            java.lang.Object r12 = r13.d(r14, r12, r0)
            if (r12 != r1) goto L9a
        L99:
            return r1
        L9a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.f0.b(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.f0.d
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.f0$d r0 = (com.moloco.sdk.internal.publisher.f0.d) r0
            int r1 = r0.f54769u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54769u = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.f0$d r0 = new com.moloco.sdk.internal.publisher.f0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f54767s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54769u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f54766r
            java.lang.String r8 = (java.lang.String) r8
            kotlin.d.b(r9)
            goto L45
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.d.b(r9)
            com.moloco.sdk.internal.publisher.g0 r9 = r7.f54756b
            r0.f54766r = r8
            r0.f54769u = r3
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L58
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 12
            r6 = 0
            java.lang.String r1 = "BidLoader"
            java.lang.String r2 = "Found no pre-preprocessor for the current mediation. Returning the original bid response."
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            return r9
        L58:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.f0.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.internal.publisher.f0.c
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.internal.publisher.f0$c r0 = (com.moloco.sdk.internal.publisher.f0.c) r0
            int r1 = r0.f54765u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54765u = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.f0$c r0 = new com.moloco.sdk.internal.publisher.f0$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f54763s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54765u
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.f54762r
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            kotlin.d.b(r10)
            goto L46
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.d.b(r10)
            com.moloco.sdk.internal.ortb.a r10 = r7.f54755a
            r0.f54762r = r9
            r0.f54765u = r3
            java.lang.Object r10 = r10.a(r8, r0)
            if (r10 != r1) goto L46
            return r1
        L46:
            com.moloco.sdk.internal.h0 r10 = (com.moloco.sdk.internal.h0) r10
            boolean r8 = r10 instanceof com.moloco.sdk.internal.h0.a
            if (r8 == 0) goto L70
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            com.moloco.sdk.internal.h0$a r10 = (com.moloco.sdk.internal.h0.a) r10
            java.lang.Object r8 = r10.a()
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r5 = 8
            r6 = 0
            java.lang.String r1 = "BidLoader"
            java.lang.String r2 = "parseBidResponse failed to parse BID json string."
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.error$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r8 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR
            com.moloco.sdk.internal.s r10 = com.moloco.sdk.internal.s.f55256d
            com.moloco.sdk.internal.d0 r8 = com.moloco.sdk.internal.e0.a(r9, r8, r10)
            com.moloco.sdk.internal.h0$a r9 = new com.moloco.sdk.internal.h0$a
            r9.<init>(r8)
            return r9
        L70:
            boolean r8 = r10 instanceof com.moloco.sdk.internal.h0.b
            if (r8 == 0) goto L95
            com.moloco.sdk.internal.h0$b r8 = new com.moloco.sdk.internal.h0$b
            com.moloco.sdk.internal.h0$b r10 = (com.moloco.sdk.internal.h0.b) r10
            java.lang.Object r9 = r10.a()
            com.moloco.sdk.internal.ortb.model.g r9 = (com.moloco.sdk.internal.ortb.model.g) r9
            java.util.List r9 = r9.getSeatBid()
            r10 = 0
            java.lang.Object r9 = r9.get(r10)
            com.moloco.sdk.internal.ortb.model.A r9 = (com.moloco.sdk.internal.ortb.model.A) r9
            java.util.List r9 = r9.getBid()
            java.lang.Object r9 = r9.get(r10)
            r8.<init>(r9)
            return r8
        L95:
            lf.m r8 = new lf.m
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.f0.d(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
