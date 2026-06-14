package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4027s9 {
    public static C4077u9 a(hh.v[] interceptors, hh.p dispatcher, hh.v[] networkInterceptors, C3964pk timeoutConfig, int i10) {
        if ((i10 & 1) != 0) {
            interceptors = new hh.v[0];
        }
        if ((i10 & 2) != 0) {
            dispatcher = A9.f36556b;
        }
        if ((i10 & 4) != 0) {
            networkInterceptors = new hh.v[0];
        }
        if ((i10 & 8) != 0) {
            timeoutConfig = new C3964pk(60L, 60L, 60L);
        }
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        return new C4077u9(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }
}
