package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
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
@e(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
final class BaseTask$invoke$1<P extends BaseParams, R> extends d {
    int label;
    /* synthetic */ Object result;

    BaseTask$invoke$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7467invokegIAlus = BaseTask.DefaultImpls.m7467invokegIAlus(null, null, this);
        return objM7467invokegIAlus == b.g() ? objM7467invokegIAlus : Result.a(objM7467invokegIAlus);
    }
}
