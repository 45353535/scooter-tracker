package com.moloco.sdk.internal.scheduling;

import eg.o0;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {
    @Override // com.moloco.sdk.internal.scheduling.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher getDefault() {
        return o0.a();
    }

    @Override // com.moloco.sdk.internal.scheduling.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher getIo() {
        return o0.b();
    }

    @Override // com.moloco.sdk.internal.scheduling.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher getMain() {
        return o0.c();
    }

    @Override // com.moloco.sdk.internal.scheduling.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher a() {
        return o0.c().w();
    }
}
