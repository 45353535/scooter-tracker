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
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
final class InitializeStateReset$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, Continuation continuation) {
        super(continuation);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7481doWorkgIAlus$suspendImpl = InitializeStateReset.m7481doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM7481doWorkgIAlus$suspendImpl == b.g() ? objM7481doWorkgIAlus$suspendImpl : Result.a(objM7481doWorkgIAlus$suspendImpl);
    }
}
