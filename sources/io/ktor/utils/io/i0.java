package io.ktor.utils.io;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f82171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f82172c;

    public i0(k channel, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f82171b = channel;
        this.f82172c = coroutineContext;
    }

    public final k a() {
        return this.f82171b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f82172c;
    }
}
