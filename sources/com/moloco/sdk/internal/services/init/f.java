package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.r;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.init.i;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.publisher.MediationInfo;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import oe.q0;
import ve.p;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f55622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f55623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.e f55624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ie.c f55627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f55628g;

    public static final class a extends kotlin.coroutines.jvm.internal.d {
        public int A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55629r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55630s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55631t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55632u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f55633v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f55634w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f55635x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f55636y;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55636y = obj;
            this.A |= Integer.MIN_VALUE;
            return f.this.a(null, null, null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55638r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ se.c f55639s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(se.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f55639s = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f55639s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            KType kTypeO;
            Object objG = pf.b.g();
            int i10 = this.f55638r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitApi", "Successful Init", null, false, 12, null);
                je.b bVarP = this.f55639s.p();
                KClass kClassB = v0.b(byte[].class);
                try {
                    kTypeO = v0.o(byte[].class);
                } catch (Throwable unused) {
                    kTypeO = null;
                }
                ff.a aVar = new ff.a(kClassB, kTypeO);
                this.f55638r = 1;
                obj = bVarP.a(aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            if (obj != null) {
                return Init$SDKInitResponse.parseFrom((byte[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
        }
    }

    public f(i0 deviceInfoService, v appInfoService, com.moloco.sdk.internal.services.usertracker.e userTrackerService, String sdkVersion, String endpoint, long j10, ie.c httpClient) {
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        Intrinsics.checkNotNullParameter(userTrackerService, "userTrackerService");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f55622a = deviceInfoService;
        this.f55623b = appInfoService;
        this.f55624c = userTrackerService;
        this.f55625d = sdkVersion;
        this.f55626e = j10;
        this.f55627f = httpClient;
        this.f55628g = Uri.parse(endpoint);
    }

    public static final Unit c(f fVar, h0 h0Var, MediationInfo mediationInfo, u uVar, p headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        r.a(headers, fVar.f55625d, h0Var.j(), mediationInfo);
        String strA = uVar.a();
        if (Intrinsics.areEqual(strA, "com.example.demo2")) {
            strA = "com.trickytribe.penetrator";
        }
        headers.e("X-Moloco-App-Bundle", strA);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016d A[Catch: Exception -> 0x01a7, TRY_LEAVE, TryCatch #3 {Exception -> 0x01a7, blocks: (B:39:0x015b, B:41:0x016d, B:51:0x01ab, B:54:0x01b7, B:56:0x020a), top: B:71:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab A[Catch: Exception -> 0x01a7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01a7, blocks: (B:39:0x015b, B:41:0x016d, B:51:0x01ab, B:54:0x01b7, B:56:0x020a), top: B:71:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.moloco.sdk.internal.services.init.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r23, com.moloco.sdk.publisher.MediationInfo r24, com.moloco.sdk.acm.recorder.a r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.f.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.moloco.sdk.internal.h0 b(Exception exc, com.moloco.sdk.acm.f fVar, com.moloco.sdk.acm.recorder.a aVar) {
        com.moloco.sdk.internal.services.init.b bVar = exc instanceof q0 ? com.moloco.sdk.internal.services.init.b.f55608b : exc instanceof SSLHandshakeException ? com.moloco.sdk.internal.services.init.b.f55611e : exc instanceof SocketException ? com.moloco.sdk.internal.services.init.b.f55610d : exc instanceof UnknownHostException ? com.moloco.sdk.internal.services.init.b.f55609c : com.moloco.sdk.internal.services.init.b.f55613g;
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", "SDK Init failed with client exception", exc, false, 8, null);
        aVar.a(fVar.f(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").f(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), bVar.name()));
        return new h0.a(new i.a(bVar));
    }
}
