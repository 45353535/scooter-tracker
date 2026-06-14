package com.unity3d.ads.adplayer;

import eg.c0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "Leg/c0;", "sdkErrorHandler", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Leg/c0;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "Leg/c0;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdPlayerScope implements CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;

    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @NotNull
    private final c0 sdkErrorHandler;

    public AdPlayerScope(@NotNull CoroutineDispatcher defaultDispatcher, @NotNull c0 sdkErrorHandler) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(sdkErrorHandler, "sdkErrorHandler");
        this.defaultDispatcher = defaultDispatcher;
        this.sdkErrorHandler = sdkErrorHandler;
        this.$$delegate_0 = i.a(defaultDispatcher.plus(sdkErrorHandler));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
