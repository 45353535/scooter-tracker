package org.bidon.sdk.stats.impl;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl", f = "SendWinLossRequestUseCaseImpl.kt", l = {37}, m = "invoke-gIAlu-s")
final class SendWinLossRequestUseCaseImpl$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendWinLossRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendWinLossRequestUseCaseImpl$invoke$1(SendWinLossRequestUseCaseImpl sendWinLossRequestUseCaseImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = sendWinLossRequestUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8677invokegIAlus = this.this$0.mo8677invokegIAlus(null, this);
        return objMo8677invokegIAlus == pf.b.g() ? objMo8677invokegIAlus : Result.a(objMo8677invokegIAlus);
    }
}
