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
@e(c = "org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl", f = "StatsRequestUseCaseImpl.kt", l = {39}, m = "invoke-0E7RQCE")
final class StatsRequestUseCaseImpl$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StatsRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsRequestUseCaseImpl$invoke$1(StatsRequestUseCaseImpl statsRequestUseCaseImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = statsRequestUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8678invoke0E7RQCE = this.this$0.mo8678invoke0E7RQCE(null, null, this);
        return objMo8678invoke0E7RQCE == pf.b.g() ? objMo8678invoke0E7RQCE : Result.a(objMo8678invoke0E7RQCE);
    }
}
