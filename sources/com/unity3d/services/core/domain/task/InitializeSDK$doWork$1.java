package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {40}, m = "doWork-gIAlu-s")
final class InitializeSDK$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$1(InitializeSDK initializeSDK, Continuation continuation) {
        super(continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7471doWorkgIAlus = this.this$0.mo7465doWorkgIAlus((EmptyParams) null, (Continuation) this);
        return objM7471doWorkgIAlus == b.g() ? objM7471doWorkgIAlus : Result.a(objM7471doWorkgIAlus);
    }
}
