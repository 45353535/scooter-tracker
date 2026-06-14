package com.moloco.sdk.acm.eventprocessing;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.http.i f54024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.d f54025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f54026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f54027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54028e;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54029r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f54030s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f54032u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54030s = obj;
            this.f54032u |= Integer.MIN_VALUE;
            Object objA = h.this.a(this);
            return objA == pf.b.g() ? objA : Result.a(objA);
        }
    }

    public h(com.moloco.sdk.acm.http.i metricsRequest, com.moloco.sdk.acm.db.d metricsDAO, e dataAgeChecker, Function1 headers) {
        Intrinsics.checkNotNullParameter(metricsRequest, "metricsRequest");
        Intrinsics.checkNotNullParameter(metricsDAO, "metricsDAO");
        Intrinsics.checkNotNullParameter(dataAgeChecker, "dataAgeChecker");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f54024a = metricsRequest;
        this.f54025b = metricsDAO;
        this.f54026c = dataAgeChecker;
        this.f54027d = headers;
        this.f54028e = "RequestAndPurgeDB";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.h.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
