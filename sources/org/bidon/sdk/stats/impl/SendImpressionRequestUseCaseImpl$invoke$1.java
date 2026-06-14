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
@e(c = "org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl", f = "SendImpressionRequestUseCaseImpl.kt", l = {40}, m = "invoke-yxL6bBk")
final class SendImpressionRequestUseCaseImpl$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendImpressionRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendImpressionRequestUseCaseImpl$invoke$1(SendImpressionRequestUseCaseImpl sendImpressionRequestUseCaseImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = sendImpressionRequestUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8676invokeyxL6bBk = this.this$0.mo8676invokeyxL6bBk(null, null, null, null, this);
        return objMo8676invokeyxL6bBk == pf.b.g() ? objMo8676invokeyxL6bBk : Result.a(objMo8676invokeyxL6bBk);
    }
}
