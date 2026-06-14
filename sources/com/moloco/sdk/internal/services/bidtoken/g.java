package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken$BidTokenRequestV3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie.c f55327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f55328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f55329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55330e;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55331r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55332s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55333t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55334u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55335v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f55336w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f55337x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f55338y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.a aVar, Continuation continuation) {
            super(2, continuation);
            this.A = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new a(this.A, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x024b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01f6 -> B:30:0x01f8). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 590
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55340r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55341s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f55343u;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55341s = obj;
            this.f55343u |= Integer.MIN_VALUE;
            return g.this.d(null, this);
        }
    }

    public g(String sdkVersion, ie.c httpClient, m httpRequestInfo, j deviceRequestInfo) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(httpRequestInfo, "httpRequestInfo");
        Intrinsics.checkNotNullParameter(deviceRequestInfo, "deviceRequestInfo");
        this.f55326a = sdkVersion;
        this.f55327b = httpClient;
        this.f55328c = httpRequestInfo;
        this.f55329d = deviceRequestInfo;
        this.f55330e = "BidTokenApi";
    }

    public static final Unit e(g gVar, ve.p headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.r.b(headers, gVar.f55326a, gVar.f55329d.a(), null, 4, null);
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.d
    public Object a(com.moloco.sdk.acm.recorder.a aVar, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(aVar, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0115, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.g.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final byte[] f() {
        byte[] byteArray = ((BidToken$BidTokenRequestV3) BidToken$BidTokenRequestV3.newBuilder().build()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
