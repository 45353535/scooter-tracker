package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateCreate;
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
@e(c = "com.unity3d.services.core.domain.task.InitializeStateCreate", f = "InitializeStateCreate.kt", l = {28}, m = "doWork-gIAlu-s")
final class InitializeStateCreate$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateCreate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateCreate$doWork$1(InitializeStateCreate initializeStateCreate, Continuation continuation) {
        super(continuation);
        this.this$0 = initializeStateCreate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7476doWorkgIAlus = this.this$0.mo7465doWorkgIAlus((InitializeStateCreate.Params) null, (Continuation) this);
        return objM7476doWorkgIAlus == b.g() ? objM7476doWorkgIAlus : Result.a(objM7476doWorkgIAlus);
    }
}
