package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public interface l {

    public interface a {
        void a();

        void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar);

        void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar);
    }

    StateFlow isLoaded();

    void j(long j10, a aVar);
}
