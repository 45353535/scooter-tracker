package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
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
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", f = "InitializeStateConfigWithLoader.kt", l = {33}, m = "doWork-gIAlu-s")
final class InitializeStateConfigWithLoader$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, Continuation continuation) {
        super(continuation);
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7465doWorkgIAlus = this.this$0.mo7465doWorkgIAlus((InitializeStateConfigWithLoader.Params) null, (Continuation) this);
        return objMo7465doWorkgIAlus == b.g() ? objMo7465doWorkgIAlus : Result.a(objMo7465doWorkgIAlus);
    }
}
