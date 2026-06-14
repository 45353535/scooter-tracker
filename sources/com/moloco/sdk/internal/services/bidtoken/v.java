package com.moloco.sdk.internal.services.bidtoken;

import android.util.Base64;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.internal.MolocoLogger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f55476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f55477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.encryption.a f55478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.providers.m f55479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f55481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f55482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f55483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Mutex f55484j;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55485r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55486s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55487t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55488u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f55489v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f55490w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f55492y;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55490w = obj;
            this.f55492y |= Integer.MIN_VALUE;
            Object objA = v.this.a(null, null, null, this);
            return objA == pf.b.g() ? objA : Result.a(objA);
        }
    }

    public v(com.moloco.sdk.internal.services.i timeProviderService, s clientBidTokenBuilder, com.moloco.sdk.internal.services.encryption.a encryptionService, com.moloco.sdk.internal.services.bidtoken.providers.m signalProvider) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(clientBidTokenBuilder, "clientBidTokenBuilder");
        Intrinsics.checkNotNullParameter(encryptionService, "encryptionService");
        Intrinsics.checkNotNullParameter(signalProvider, "signalProvider");
        this.f55476b = timeProviderService;
        this.f55477c = clientBidTokenBuilder;
        this.f55478d = encryptionService;
        this.f55479e = signalProvider;
        this.f55480f = "ClientBidTokenServiceImpl";
        this.f55481g = "";
        this.f55482h = "";
        this.f55483i = h.a();
        this.f55484j = ng.f.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.a r12, java.lang.String r13, com.moloco.sdk.internal.services.bidtoken.i r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.v.a(com.moloco.sdk.acm.recorder.a, java.lang.String, com.moloco.sdk.internal.services.bidtoken.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String b(String str, com.moloco.sdk.acm.recorder.a aVar) {
        Exception exc;
        String str2;
        if (str.length() == 0) {
            aVar.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.A.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), "empty_public_key"));
            return "";
        }
        com.moloco.sdk.acm.f fVarC = aVar.c(com.moloco.sdk.internal.client_metrics_data.d.f54196p.g());
        try {
            long jA = this.f55476b.a();
            try {
                byte[] bArrA = this.f55478d.a(str);
                String str3 = "update_signal_state";
                try {
                    this.f55479e.a();
                    str3 = "provide_signal";
                    BidToken$ClientBidTokenComponents bidToken$ClientBidTokenComponentsA = this.f55477c.a((com.moloco.sdk.internal.services.bidtoken.providers.k) this.f55479e.d(), this.f55483i);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.debugBuildLog$default(molocoLogger, this.f55480f, "BidToken Component: " + bidToken$ClientBidTokenComponentsA, false, 4, null);
                    byte[] bArrEncode = Base64.encode(bidToken$ClientBidTokenComponentsA.toByteArray(), 0);
                    try {
                        com.moloco.sdk.internal.services.encryption.a aVar2 = this.f55478d;
                        Intrinsics.checkNotNull(bArrEncode);
                        byte[] bArrEncode2 = Base64.encode(aVar2.a(bArrEncode), 0);
                        s sVar = this.f55477c;
                        Intrinsics.checkNotNull(bArrEncode2);
                        String strEncodeToString = Base64.encodeToString(sVar.a(bArrEncode2, bArrA), 0);
                        com.moloco.sdk.internal.client_metrics_data.c cVar = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                        aVar.a(fVarC.f(cVar.g(), "success"));
                        aVar.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.A.g()).e(cVar.g(), "success"));
                        MolocoLogger.info$default(molocoLogger, this.f55480f, "Client bid token build time: " + (this.f55476b.a() - jA) + " ms", null, false, 12, null);
                        return "v2:" + strEncodeToString;
                    } catch (Exception e10) {
                        exc = e10;
                        str2 = "aes";
                        String simpleName = exc.getClass().getSimpleName();
                        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                        MolocoLogger.warn$default(molocoLogger2, this.f55480f, "Client bid token build failed: " + simpleName, exc, false, 8, null);
                        com.moloco.sdk.acm.c cVar2 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.A.g());
                        com.moloco.sdk.internal.client_metrics_data.c cVar3 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                        com.moloco.sdk.acm.c cVarE = cVar2.e(cVar3.g(), "failure");
                        com.moloco.sdk.internal.client_metrics_data.c cVar4 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
                        com.moloco.sdk.acm.c cVarE2 = cVarE.e(cVar4.g(), simpleName);
                        if (str2.length() > 0) {
                            cVarE2.e(com.moloco.sdk.internal.client_metrics_data.c.f54179h.g(), str2);
                        }
                        MolocoLogger.debugBuildLog$default(molocoLogger2, this.f55480f, "Recording metric failure: " + cVarE2.c() + ", tags: " + CollectionsKt.joinToString$default(cVarE2.b(), StringUtils.COMMA, null, null, 0, null, null, 62, null), false, 4, null);
                        aVar.b(cVarE2);
                        aVar.a(fVarC.f(cVar3.g(), "failure").f(cVar4.g(), simpleName));
                        return "";
                    }
                } catch (Exception e11) {
                    String str4 = str3;
                    exc = e11;
                    str2 = str4;
                }
            } catch (Exception e12) {
                exc = e12;
                str2 = "rsa";
            }
        } catch (Exception e13) {
            exc = e13;
            str2 = "";
        }
    }

    public final boolean c(i iVar) {
        i iVar2 = this.f55483i;
        this.f55483i = iVar;
        boolean zAreEqual = Intrinsics.areEqual(iVar2, iVar);
        boolean z10 = !zAreEqual;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55480f, !zAreEqual ? "config updated" : "config didn't change", false, 4, null);
        return z10;
    }

    public final boolean d(String str, i iVar) {
        if (!Intrinsics.areEqual(this.f55481g, str)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55480f, "rp changed, needs refresh", false, 4, null);
            return true;
        }
        if (c(iVar)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55480f, "config changed, needs refresh", false, 4, null);
            return true;
        }
        if (this.f55482h.length() == 0) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55480f, "cached bidToken is empty, needs refresh", false, 4, null);
            return true;
        }
        if (this.f55479e.b()) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55480f, "signal provider updated, needs refresh", false, 4, null);
            return true;
        }
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55480f, "Bid token doesn't need refresh", false, 4, null);
        return false;
    }
}
