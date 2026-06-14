package org.bidon.sdk.config.impl;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.GetConfigRequestUseCaseImpl", f = "GetConfigRequestUseCaseImpl.kt", l = {39}, m = "request-gIAlu-s")
final class GetConfigRequestUseCaseImpl$request$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetConfigRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetConfigRequestUseCaseImpl$request$1(GetConfigRequestUseCaseImpl getConfigRequestUseCaseImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = getConfigRequestUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8674requestgIAlus = this.this$0.mo8674requestgIAlus(null, this);
        return objMo8674requestgIAlus == pf.b.g() ? objMo8674requestgIAlus : Result.a(objMo8674requestgIAlus);
    }
}
