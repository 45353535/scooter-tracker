package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55496e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55497f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.bidtoken.b f55498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f55499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f55500d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55501r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55502s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f55504u;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55502s = obj;
            this.f55504u |= Integer.MIN_VALUE;
            return z.this.a(this);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55505r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55506s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55507t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f55508u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f55510w;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55508u = obj;
            this.f55510w |= Integer.MIN_VALUE;
            return z.this.a(null, this);
        }
    }

    public z(com.moloco.sdk.internal.bidtoken.b bidTokenParser, com.moloco.sdk.internal.services.i timeProviderService) {
        Intrinsics.checkNotNullParameter(bidTokenParser, "bidTokenParser");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f55498b = bidTokenParser;
        this.f55499c = timeProviderService;
        this.f55500d = new n("", "", h.a());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.y
    public n a() {
        return this.f55500d;
    }

    public final void b(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.z.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.moloco.sdk.internal.services.bidtoken.n r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.z.a(com.moloco.sdk.internal.services.bidtoken.n, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
