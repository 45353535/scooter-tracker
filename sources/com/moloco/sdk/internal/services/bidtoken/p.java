package com.moloco.sdk.internal.services.bidtoken;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f55369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f55370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Mutex f55372d;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55373r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55374s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55375t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55376u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f55377v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f55378w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f55380y;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55378w = obj;
            this.f55380y |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    public p(b0 serverBidTokenService, u clientBidTokenService) {
        Intrinsics.checkNotNullParameter(serverBidTokenService, "serverBidTokenService");
        Intrinsics.checkNotNullParameter(clientBidTokenService, "clientBidTokenService");
        this.f55369a = serverBidTokenService;
        this.f55370b = clientBidTokenService;
        this.f55371c = "BidTokenServiceImpl";
        this.f55372d = ng.f.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:21:0x006c, B:34:0x00c4, B:36:0x00d0), top: B:59:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0046, B:40:0x00f1, B:43:0x00f8, B:45:0x0100, B:51:0x012d, B:46:0x0112), top: B:61:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0046, B:40:0x00f1, B:43:0x00f8, B:45:0x0100, B:51:0x012d, B:46:0x0112), top: B:61:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.moloco.sdk.internal.services.bidtoken.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.a r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.p.a(com.moloco.sdk.acm.recorder.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(com.moloco.sdk.acm.f fVar, com.moloco.sdk.acm.recorder.a aVar, String str) {
        if (str == null) {
            com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54166t.g());
            com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
            aVar.b(cVar.e(cVar2.g(), "success"));
            aVar.a(fVar.f(cVar2.g(), "success"));
            return;
        }
        com.moloco.sdk.acm.c cVar3 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54166t.g());
        com.moloco.sdk.internal.client_metrics_data.c cVar4 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
        com.moloco.sdk.acm.c cVarE = cVar3.e(cVar4.g(), "failure");
        com.moloco.sdk.internal.client_metrics_data.c cVar5 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
        aVar.b(cVarE.e(cVar5.g(), str));
        aVar.a(fVar.f(cVar4.g(), "failure").f(cVar5.g(), str));
    }
}
