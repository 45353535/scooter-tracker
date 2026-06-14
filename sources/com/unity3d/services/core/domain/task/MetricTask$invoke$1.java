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
@e(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {24}, m = "invoke-gIAlu-s$suspendImpl")
final class MetricTask$invoke$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MetricTask$invoke$1(MetricTask<? super P, R> metricTask, Continuation continuation) {
        super(continuation);
        this.this$0 = metricTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7483invokegIAlus$suspendImpl = MetricTask.m7483invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM7483invokegIAlus$suspendImpl == b.g() ? objM7483invokegIAlus$suspendImpl : Result.a(objM7483invokegIAlus$suspendImpl);
    }
}
