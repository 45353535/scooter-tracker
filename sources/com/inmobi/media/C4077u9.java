package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* JADX INFO: renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4077u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4147x4 f39655a;

    public C4077u9(hh.v[] interceptors, hh.v[] networkInterceptors, hh.p dispatcher, C3964pk timeoutConfig) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f39655a = new C4147x4(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }

    public final Deferred a(Me request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return eg.i.b(A9.f36557c, null, null, new C4052t9(this, request, null), 3, null);
    }
}
