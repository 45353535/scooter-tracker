package io.ktor.utils.io;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f82103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f82104c;

    public f0(e channel, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f82103b = channel;
        this.f82104c = coroutineContext;
    }

    public final e a() {
        return this.f82103b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f82104c;
    }
}
