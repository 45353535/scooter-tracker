package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.e0;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oe.m0;
import oe.p0;
import oe.r0;
import oe.t0;
import ve.z;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f56255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.b f56256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ie.c f56257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56258d;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56259r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f56260s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f56261t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f56263v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ File f56264w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, Continuation continuation) {
            super(2, continuation);
            this.f56263v = str;
            this.f56264w = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new a(this.f56263v, this.f56264w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0222  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 587
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(e0 connectivityService, com.moloco.sdk.internal.error.b errorReportingService, ie.c httpClient) {
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f56255a = connectivityService;
        this.f56256b = errorReportingService;
        this.f56257c = httpClient;
        this.f56258d = "LegacyMediaDownloader";
    }

    public static final long a(r0 delayMillis, int i10) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    public static final Unit h(final j jVar, m0 retry) {
        Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.D(10);
        m0.g(retry, false, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(j.a((r0) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.v(10, true);
        retry.A(10);
        retry.r(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j.i(this.f56254b, (t0) obj, (re.d) obj2);
            }
        });
        return Unit.f93236a;
    }

    public static final Unit i(j jVar, t0 modifyRequest, re.d it) {
        Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, jVar.f56258d, "Retry attempt #" + modifyRequest.b() + " for " + modifyRequest.a().i(), null, false, 12, null);
        return Unit.f93236a;
    }

    public Object d(String str, File file, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(str, file, null), continuation);
    }

    public final Object e(String str, Continuation continuation) {
        ie.c cVar = this.f56257c;
        re.d dVar = new re.d();
        re.f.c(dVar, str);
        p0.v(dVar, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.h(this.f56253b, (m0) obj);
            }
        });
        dVar.o(z.f106771b.b());
        return new se.g(dVar, cVar).b(continuation);
    }

    public final String g(boolean z10) {
        return z10 ? "HTTP_REQUEST_COMPLETE_TIMEOUT" : "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT";
    }
}
