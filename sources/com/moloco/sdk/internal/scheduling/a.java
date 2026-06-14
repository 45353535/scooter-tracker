package com.moloco.sdk.internal.scheduling;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    CoroutineContext a();

    CoroutineContext getDefault();

    CoroutineContext getIo();

    CoroutineContext getMain();
}
