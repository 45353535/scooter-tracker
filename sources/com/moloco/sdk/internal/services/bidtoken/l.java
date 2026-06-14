package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.publisher.o0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f55352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f55353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f55354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55355d;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55356r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55357s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55358t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f55359u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f55360v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f55362x;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55360v = obj;
            this.f55362x |= Integer.MIN_VALUE;
            return l.this.a(null, null, null, this);
        }
    }

    public l(o bidTokenService, o0 initializationHandler, com.moloco.sdk.internal.services.i timeProviderService) {
        Intrinsics.checkNotNullParameter(bidTokenService, "bidTokenService");
        Intrinsics.checkNotNullParameter(initializationHandler, "initializationHandler");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f55352a = bidTokenService;
        this.f55353b = initializationHandler;
        this.f55354c = timeProviderService;
        this.f55355d = "BidTokenHandlerImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.moloco.sdk.internal.services.bidtoken.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.a r17, com.moloco.sdk.publisher.MediationInfo r18, com.moloco.sdk.publisher.MolocoBidTokenListener r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.l.a(com.moloco.sdk.acm.recorder.a, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.publisher.MolocoBidTokenListener, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
