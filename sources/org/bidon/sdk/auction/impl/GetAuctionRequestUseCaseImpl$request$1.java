package org.bidon.sdk.auction.impl;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl", f = "GetAuctionRequestUseCaseImpl.kt", l = {52}, m = "request-hUnOzRk")
final class GetAuctionRequestUseCaseImpl$request$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAuctionRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAuctionRequestUseCaseImpl$request$1(GetAuctionRequestUseCaseImpl getAuctionRequestUseCaseImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = getAuctionRequestUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8671requesthUnOzRk = this.this$0.mo8671requesthUnOzRk(null, null, null, null, null, this);
        return objMo8671requesthUnOzRk == pf.b.g() ? objMo8671requesthUnOzRk : Result.a(objMo8671requesthUnOzRk);
    }
}
